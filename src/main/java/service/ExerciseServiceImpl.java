package service;

import data.ExerciseDao;
import data.ExerciseDaoImpl;
import domain.Exercise;
import domain.ExerciseName;
import dto.ExerciseDTO;
import expection.ObjectNotFoundException;
import mapper.ExerciseMapper;
import mapper.MapperInterface;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class ExerciseServiceImpl implements ExerciseService{

    private final static ExerciseDao exerciseDaoImpl = new ExerciseDaoImpl();

    private final MapperInterface<Exercise,ExerciseDTO> exerciseMapper = new ExerciseMapper();

    @Override
    public ExerciseDTO findExerciseByUserIdAndByExerciseNameAndByDate(Long userId, ExerciseName name, LocalDate date) {
        try{
            exerciseDaoImpl.openCurrentSession();
            Exercise exercise = exerciseDaoImpl.findExerciseByUserIdAndByExerciseNameAndByDate(userId,name,date).orElseThrow(() -> new ObjectNotFoundException(Exercise.class));
            exerciseDaoImpl.closeCurrentSession();
            return exerciseMapper.entityToDTO(exercise);
        }catch (NullPointerException e){
            throw new ObjectNotFoundException(Exercise.class);
        }
    }

    @Override
    public List<ExerciseDTO> findAllByUserIdAndByExerciseNameOrderedByDate(Long userId, ExerciseName name) {
        exerciseDaoImpl.openCurrentSession();
        List<ExerciseDTO> list = exerciseDaoImpl.findAllByUserIdAndByExerciseNameOrderedByDate(userId,name).stream()
                .map((exerciseMapper::entityToDTO)).collect(Collectors.toList());
        exerciseDaoImpl.closeCurrentSession();
        return list;
    }

    @Override
    public void save(ExerciseDTO exerciseDTO) throws NullPointerException {
        exerciseDaoImpl.openCurrentSessionWithTransaction();
        exerciseDaoImpl.save(exerciseMapper.dtoToEntity(exerciseDTO));
        exerciseDaoImpl.closeCurrentSessionWithTransaction();
    }

    @Override
    public void update(ExerciseDTO exerciseDTO) throws NullPointerException{
        exerciseDaoImpl.openCurrentSessionWithTransaction();
        exerciseDaoImpl.update(exerciseMapper.dtoToEntity(exerciseDTO));
        exerciseDaoImpl.closeCurrentSessionWithTransaction();
    }


    @Override
    public Double calculateOneRepMaxByUserIdAndExerciseName(Long userId, ExerciseName name) {
        try {
            return Collections.max(findAllByUserIdAndByExerciseNameOrderedByDate(userId,name).stream().map(ExerciseDTO::getOneRepMax).collect(Collectors.toList()));
        }catch (NullPointerException | NoSuchElementException e){
            return 0d;
        }
    }

    @Override
    public Double calculateTotalByUserId(Long userId) {
        return (calculateOneRepMaxByUserIdAndExerciseName(userId,ExerciseName.SQUAT) + calculateOneRepMaxByUserIdAndExerciseName(userId,ExerciseName.BENCH_PRESS) + calculateOneRepMaxByUserIdAndExerciseName(userId,ExerciseName.DEADLIFT));
    }
}
