package com.example.demo.exercise;

public interface ExerciseDAO {

    void save(Exercise exercise);

    Exercise findExercise(String name);
}
