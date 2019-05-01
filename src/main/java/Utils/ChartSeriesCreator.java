package Utils;

import dto.ExerciseDTO;
import javafx.scene.chart.XYChart;

import java.util.List;
import java.util.stream.Collectors;

public class ChartSeriesCreator {

    private static XYChart.Series createSeries(List<Point> list){
        XYChart.Series<String,Double> series = new XYChart.Series<>();

        list.forEach(point -> series.getData().add(new XYChart.Data<>(point.getX(), point.getY())));

        return series;
    }

    public static XYChart.Series createVolumeSeries(List<ExerciseDTO> exerciseDTOS){
        return createSeries(exerciseDTOS.stream()
                .map(exerciseDTO -> new Point(exerciseDTO.getDate(),exerciseDTO.getVolume()))
                .collect(Collectors.toList()));
    }


    public static XYChart.Series createOneRepMaxSquatSeries(List<ExerciseDTO> exerciseDTOS){
        return createSeries(exerciseDTOS.stream()
                .map(exerciseDTO -> new Point(exerciseDTO.getDate(),exerciseDTO.getOneRepMax()))
                .collect(Collectors.toList()));
    }


}
