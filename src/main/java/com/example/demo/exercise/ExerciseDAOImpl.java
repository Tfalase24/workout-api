package com.example.demo.exercise;

import jakarta.persistence.EntityManager;
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
    public void save(ExerciseClass exercise) {
        entityManager.persist(exercise);
    }
}
