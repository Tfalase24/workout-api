package com.example.demo.exercise;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExerciseDAOImpl implements ExerciseDAO{

    EntityManager entityManager;

    @Autowired
    public ExerciseDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Exercise exercise) {
        entityManager.persist(exercise);
    }

    @Override
    public Exercise findExercise(String name) {
        TypedQuery<Exercise> theQuery = entityManager.createQuery("FROM Exercise", Exercise.class);
        return theQuery.getSingleResult();
    }

    @Override
    public Exercise findByMuscleGroup(MuscleGroup muscleGroup) {
        TypedQuery<Exercise> theQuery = entityManager.createQuery("FROM Exercise WHERE muscleGroup=:theData", Exercise.class);
        theQuery.setParameter("theData", muscleGroup);
        return theQuery.getSingleResult();
    }


}
