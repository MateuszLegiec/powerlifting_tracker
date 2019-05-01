package dto;

import domain.ExerciseName;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Builder
@Data
public class ExerciseDTO {

    private long id;
    private LocalDate date;
    private ExerciseName name;
    private String sets;
    private String reps;
    private String weight;
    private Long userId;

    public double getOneRepMax(){

        Map<Integer,Double> weightMultiplication = new HashMap<>();
                weightMultiplication.put(1,1.00);
                weightMultiplication.put(2,1.05);
                weightMultiplication.put(3,1.08);
                weightMultiplication.put(4,1.11);
                weightMultiplication.put(5,1.15);
                weightMultiplication.put(6,1.18);
                weightMultiplication.put(7,1.20);
                weightMultiplication.put(8,1.25);
                weightMultiplication.put(9,1.30);
                weightMultiplication.put(10,1.33);
                weightMultiplication.put(11,1.43);
                weightMultiplication.put(12,1.49);
                weightMultiplication.put(13,1.51);
                weightMultiplication.put(14,1.52);
                weightMultiplication.put(15,1.54);

        return Double.parseDouble(weight)*weightMultiplication.get(Integer.parseInt(reps));
    }

    public String getVolume(){
        return String.valueOf(Double.parseDouble(weight)*Integer.parseInt(reps)*Integer.parseInt(sets));
    }
}
