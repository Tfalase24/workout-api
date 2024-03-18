package com.example.demo.exercise;

import jakarta.persistence.EntityManager;

public interface ExerciseDAO {

    void save(ExerciseClass exercise);
}
