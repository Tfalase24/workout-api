package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class BenchPress extends AbstractExerciseClass{
    public BenchPress(ExerciseGoal exerciseGoal){
        super("Bench Press", DifficultyOfExercise.HARD, new ArrayList<>(Arrays.asList(MuscleGroup.CHEST, MuscleGroup.TRICEP)), new ArrayList<>(Arrays.asList(MuscleGroup.BACK, MuscleGroup.BICEP)), exerciseGoal, ExerciseType.SHORTENING);
    }

}
