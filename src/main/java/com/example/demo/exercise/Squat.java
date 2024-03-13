package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Squat extends AbstractExerciseClass {

    public Squat(ExerciseGoal exerciseGoal){
        super("Squat", DifficultyOfExercise.MEDIUM, new ArrayList<>(Arrays.asList(MuscleGroup.GLUTE, MuscleGroup.QUADRICEP)), new ArrayList<>(Arrays.asList(MuscleGroup.HAMSTRING, MuscleGroup.HIP)), exerciseGoal, ExerciseType.SHORTENING);
    }
}
