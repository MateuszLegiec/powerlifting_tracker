package validation;

import dto.ExerciseDTO;
import expection.IncorrectInputException;

public class ExerciseValidator {

    public static void validate(ExerciseDTO target) throws IncorrectInputException {

        try{
            int reps = Integer.parseInt(target.getReps());
            int sets = Integer.parseInt(target.getSets());
            double weight = Double.parseDouble(target.getWeight());

            if (!(positiveNumber(reps) && positiveNumber(sets) && positiveNumber(weight)))
                throw new IncorrectInputException("All data have to be positive");

        }catch (NumberFormatException e){
            throw new IncorrectInputException("" +
                    "SETS and REPS fields have to be filled with an integer \n" +
                    "Weight field have to be filled with floating point number");
        }catch (IllegalArgumentException e){
            throw new IncorrectInputException("You have to choose the name of the lift");
        }


    }

    private static boolean positiveNumber(int number){
        return number>0;
    }

    private static boolean positiveNumber(double number){
        return number>0;
    }
}
