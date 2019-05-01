package controller;

import Utils.AlterGenerator;
import Utils.ChartSeriesCreator;
import Utils.SheetExporter;
import Utils.WilksCalculator;

import domain.ExerciseName;
import domain.Gender;

import dto.ExerciseDTO;
import dto.UserDTO;

import expection.IncorrectInputException;
import expection.ObjectNotFoundException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;

import javafx.stage.Stage;
import service.ExerciseService;
import service.ExerciseServiceImpl;
import service.UserService;
import service.UserServiceImpl;

import validation.ExerciseValidator;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class MainWindowController implements Initializable {



    @FXML
    TextField reps;
    @FXML
    TextField sets;
    @FXML
    TextField weight;
    @FXML
    ChoiceBox exercise;

    @FXML
    Button saveButton;
    @FXML
    Button signOutButton;
    @FXML
    Button downloadButton;
    @FXML
    Button updateBodyWeightButton;
    @FXML
    DatePicker datePicker;


    @FXML
    Label usernameLabel;
    @FXML
    Label wilksLabel;
    @FXML
    Label totalLabel;
    @FXML
    Label bpLabel;
    @FXML
    Label stLabel;
    @FXML
    Label dlLabel;
    @FXML
    TextField bodyWeightTextField;


    @FXML
    CheckBox stChecker;
    @FXML
    CheckBox bpChecker;
    @FXML
    CheckBox dlChecker;

    @FXML
    CheckBox maxChecker;
    @FXML
    CheckBox volumeChecker;

    @FXML
    LineChart<String,Double> chart;


    private final UserService userService = new UserServiceImpl();

    private final ExerciseService exerciseService = new ExerciseServiceImpl();

    private UserDTO userDTO;

    private final SheetExporter sheetExporter = new SheetExporter();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        chart.setCreateSymbols(true);
        chart.setLegendVisible(false);
        saveButton.setOnMouseClicked(event -> saveExercise());
        signOutButton.setOnMouseClicked(event -> signOut());
        downloadButton.setOnMouseClicked(event -> downloadXLS());
        updateBodyWeightButton.setOnMouseClicked(event -> updateBodyWeight());
        maxChecker.setOnMouseClicked(event -> {volumeChecker.setSelected(false);printChart();});
        volumeChecker.setOnMouseClicked(event -> {maxChecker.setSelected(false);printChart();});
        bpChecker.setOnMouseClicked(event -> {stChecker.setSelected(false);dlChecker.setSelected(false);printChart();});
        stChecker.setOnMouseClicked(event -> {dlChecker.setSelected(false);bpChecker.setSelected(false);printChart();});
        dlChecker.setOnMouseClicked(event -> {stChecker.setSelected(false);bpChecker.setSelected(false);printChart();});

    }

    private void signOut() {
        try {
            Parent loginParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Scene/LoginScene.fxml")));
            Scene loginScene = new Scene(loginParent,800,300);
            Stage loginStage = (Stage) signOutButton.getScene().getWindow();
            loginStage.setScene(loginScene);
            loginStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void updateBodyWeight() {
        try {
            Double newWeight = Double.parseDouble(bodyWeightTextField.getText());
            if(newWeight<=40 || (userDTO.getGender().equals(Gender.MALE) && newWeight>206) || (userDTO.getGender().equals(Gender.FEMALE) && newWeight>151))
                throw new IncorrectInputException();

            String wilks = WilksCalculator.getWilks(userDTO,exerciseService.calculateTotalByUserId(userDTO.getId()));

            userDTO.setBodyWeight(bodyWeightTextField.getText());
            userService.update(userDTO);
            wilksLabel.setText(wilks.substring(0,Math.min(wilks.length(),8)));
        }catch (NumberFormatException | IncorrectInputException e){
            AlterGenerator.createSimpleAlter("Error","","Body weight should be in range \n Female: <40,151) \n Male: <40,206)");
        }
    }

    private void saveExercise(){

        ExerciseDTO exerciseDTO = ExerciseDTO.builder()
                .name(ExerciseName.valueOf(String.valueOf(exercise.getValue())))
                .date(datePicker.getValue())
                .reps(reps.getText())
                .sets(sets.getText())
                .weight(weight.getText())
                .userId(userDTO.getId())
                .build();

        try{

            ExerciseValidator.validate(exerciseDTO);
            exerciseDTO.setId(exerciseService.findExerciseByUserIdAndByExerciseNameAndByDate(userDTO.getId(),exerciseDTO.getName(),exerciseDTO.getDate()).getId());
            exerciseService.update(exerciseDTO);

        }catch (ObjectNotFoundException e){

            ExerciseValidator.validate(exerciseDTO);
            exerciseService.save(exerciseDTO);

        }catch (IncorrectInputException e){
            AlterGenerator.createSimpleAlter("Error","",e.getMessage());
        }

        setUserData();
        printChart();

    }

    private void printChart(){

        chart.getData().clear();

        XYChart.Series series = new XYChart.Series();
        boolean printChart = true;

        if(volumeChecker.isSelected()){
            if(stChecker.isSelected()){
                series = ChartSeriesCreator.createVolumeSeries(exerciseService.findAllByUserIdAndByExerciseNameOrderedByDate(userDTO.getId(),ExerciseName.SQUAT));
            }else if (bpChecker.isSelected()){
                series = ChartSeriesCreator.createVolumeSeries(exerciseService.findAllByUserIdAndByExerciseNameOrderedByDate(userDTO.getId(),ExerciseName.BENCH_PRESS));
            }else if (dlChecker.isSelected()){
                series = ChartSeriesCreator.createVolumeSeries(exerciseService.findAllByUserIdAndByExerciseNameOrderedByDate(userDTO.getId(),ExerciseName.DEADLIFT));
            }else {
                printChart = false;
            }
        }else if(maxChecker.isSelected()){
            if(stChecker.isSelected()){
                series = ChartSeriesCreator.createOneRepMaxSquatSeries(exerciseService.findAllByUserIdAndByExerciseNameOrderedByDate(userDTO.getId(),ExerciseName.SQUAT));
            }else if (bpChecker.isSelected()){
                series = ChartSeriesCreator.createOneRepMaxSquatSeries(exerciseService.findAllByUserIdAndByExerciseNameOrderedByDate(userDTO.getId(),ExerciseName.BENCH_PRESS));
            }else if (dlChecker.isSelected()){
                series = ChartSeriesCreator.createOneRepMaxSquatSeries(exerciseService.findAllByUserIdAndByExerciseNameOrderedByDate(userDTO.getId(),ExerciseName.DEADLIFT));
            }else {
                printChart = false;
            }
        }else {
            printChart = false;
        }

        if(printChart){
            chart.getData().addAll(series);
        }

    }

    void setUserData(){

        Double st = exerciseService.calculateOneRepMaxByUserIdAndExerciseName(userDTO.getId(),ExerciseName.SQUAT);
        Double bp = exerciseService.calculateOneRepMaxByUserIdAndExerciseName(userDTO.getId(),ExerciseName.BENCH_PRESS);
        Double dl = exerciseService.calculateOneRepMaxByUserIdAndExerciseName(userDTO.getId(),ExerciseName.DEADLIFT);
        Double total = st+bp+dl;
        String wilks = WilksCalculator.getWilks(userDTO,total);

        usernameLabel.setText(userDTO.getUsername());
        bodyWeightTextField.setPromptText(userDTO.getBodyWeight().substring(Math.min(7,userDTO.getBodyWeight().length())));
        wilksLabel.setText(wilks.substring(0,Math.min(7,wilks.length())));
        totalLabel.setText(String.format("%.02f", total));
        stLabel.setText(String.format("%.02f", st));
        bpLabel.setText(String.format("%.02f", bp));
        dlLabel.setText(String.format("%.02f", dl));

    }

    private void downloadXLS(){
        sheetExporter.exportSheet(userDTO);
    }

    void setUserDTO(UserDTO userDTO){
        this.userDTO = userDTO;
    }

}