package data;

import domain.Exercise;
import domain.ExerciseName;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ExerciseDao extends InterfaceDao<Exercise,Long> {

    Optional<Exercise> findExerciseByUserIdAndByExerciseNameAndByDate(Long userId, ExerciseName name, LocalDate date);
    List<Exercise> findAllByUserIdAndByExerciseNameOrderedByDate(Long userId,ExerciseName name);

}
