package data;

import domain.Exercise;
import domain.ExerciseName;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ExerciseDaoImpl extends HibernateConnector implements ExerciseDao {

    @Override
    public Optional<Exercise> findExerciseByUserIdAndByExerciseNameAndByDate(Long userId, ExerciseName name, LocalDate date) {
        return Optional.of((Exercise) getCurrentSession().createQuery("from Exercise where user.id=:userId and name=:name and date=:date")
                .setParameter("userId",userId)
                .setParameter("name",name)
                .setParameter("date",date)
                .uniqueResult());
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Exercise> findAllByUserIdAndByExerciseNameOrderedByDate(Long userId, ExerciseName name) {
        return getCurrentSession().createQuery("from Exercise where user.id = :userId and name= :name order by date")
                .setParameter("userId",userId)
                .setParameter("name",name)
                .list();
    }

}
