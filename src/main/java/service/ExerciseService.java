package service;

import domain.ExerciseName;
import dto.ExerciseDTO;

import java.time.LocalDate;
import java.util.List;

public interface ExerciseService {

    ExerciseDTO findExerciseByUserIdAndByExerciseNameAndByDate(Long userId, ExerciseName name, LocalDate date);
    List<ExerciseDTO> findAllByUserIdAndByExerciseNameOrderedByDate(Long userId, ExerciseName name);
    void save(ExerciseDTO exerciseDTO);
    void update(ExerciseDTO exerciseDTO);
    Double calculateOneRepMaxByUserIdAndExerciseName(Long userId, ExerciseName name);
    Double calculateTotalByUserId(Long userId);
}
