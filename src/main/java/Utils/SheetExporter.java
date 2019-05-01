package Utils;

import com.google.common.collect.ObjectArrays;
import domain.ExerciseName;
import dto.ExerciseDTO;
import dto.UserDTO;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import service.ExerciseService;
import service.ExerciseServiceImpl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


public class SheetExporter {

    private ExerciseService exerciseService = new ExerciseServiceImpl();

    public void exportSheet(UserDTO userDTO){

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(userDTO.getUsername() + " StrengthProgress");

        int rowNum = 0;
        for(String[] data : this.generateSheet(userDTO)){
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for(String field : data){
                row.createCell(colNum++).setCellValue(field);
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream( userDTO.getUsername() + "StrengthProgressExcel.xlsx");
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String[][] generateSheet(UserDTO userDTO){

        List<ExerciseDTO> squats = exerciseService.findAllByUserIdAndByExerciseNameOrderedByDate(userDTO.getId(),ExerciseName.SQUAT);
        List<ExerciseDTO> deadlifts = exerciseService.findAllByUserIdAndByExerciseNameOrderedByDate(userDTO.getId(),ExerciseName.BENCH_PRESS);
        List<ExerciseDTO> benchPresses = exerciseService.findAllByUserIdAndByExerciseNameOrderedByDate(userDTO.getId(),ExerciseName.DEADLIFT);

        String total = String.valueOf(exerciseService.calculateTotalByUserId(userDTO.getId()));

        return new String[][]{
                {"username:" + userDTO.getUsername()},
                {"body weight:",  userDTO.getBodyWeight()},
                {"total:", total},
                {"wilks", WilksCalculator.getWilks(userDTO, Double.valueOf(total))},
                {},
                dateRow(squats),
                sets_reps_weight_row("Squat",squats),
                volumeRow(squats),
                oneRepMaxRow(squats),
                {},
                dateRow(benchPresses),
                sets_reps_weight_row("BenchPress",benchPresses),
                volumeRow(benchPresses),
                oneRepMaxRow(benchPresses),
                {},
                dateRow(deadlifts),
                sets_reps_weight_row("Deadlift",deadlifts),
                volumeRow(deadlifts),
                oneRepMaxRow(deadlifts),
        };
    }

    private String[] sets_reps_weight_row(String liftName, List<ExerciseDTO> exerciseDTOS){
        return ObjectArrays.concat(liftName,exerciseDTOS.stream().map(this::trainingInfoCell).toArray(String[]::new));
    }
    private String[] dateRow(List<ExerciseDTO> exerciseDTOs){
        return ObjectArrays.concat("date:",exerciseDTOs.stream().map(exerciseDTO -> exerciseDTO.getDate().toString()).toArray(String[]::new));
    }

    private String[] oneRepMaxRow(List<ExerciseDTO> exerciseDTOs){
        return ObjectArrays.concat("oneRepMax:",exerciseDTOs.stream().map(exerciseDTO -> String.valueOf(exerciseDTO.getOneRepMax())).toArray(String[]::new));
    }

    private String[] volumeRow(List<ExerciseDTO> exerciseDTOS){
        return ObjectArrays.concat("volume:",exerciseDTOS.stream().map(ExerciseDTO::getVolume).toArray(String[]::new));
    }

    private String trainingInfoCell(ExerciseDTO exerciseDTO){
        return exerciseDTO.getSets() + "s" + exerciseDTO.getReps() + "r" + exerciseDTO.getWeight() + "kg";
    }

}
