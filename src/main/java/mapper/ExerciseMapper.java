package mapper;

import domain.Exercise;
import dto.ExerciseDTO;
import service.UserService;
import service.UserServiceImpl;

public class ExerciseMapper implements MapperInterface<Exercise, ExerciseDTO> {

    private UserService userService = new UserServiceImpl();

    @Override
    public Exercise dtoToEntity(ExerciseDTO exerciseDTO) {
        return Exercise.builder()
                .id(exerciseDTO.getId())
                .date(exerciseDTO.getDate())
                .name(exerciseDTO.getName())
                .reps(Integer.parseInt(exerciseDTO.getReps()))
                .sets(Integer.parseInt(exerciseDTO.getSets()))
                .weight(Double.parseDouble(exerciseDTO.getWeight()))
                .user(userService.findUserById(exerciseDTO.getUserId()))
                .build();
    }

    @Override
    public ExerciseDTO entityToDTO(Exercise exercise) {
        return  ExerciseDTO.builder()
                .id(exercise.getId())
                .date(exercise.getDate())
                .name(exercise.getName())
                .sets(String.valueOf(exercise.getSets()))
                .reps(String.valueOf(exercise.getReps()))
                .weight(String.valueOf(exercise.getWeight()))
                .build();
    }
}
