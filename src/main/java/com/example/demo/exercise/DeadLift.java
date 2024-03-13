package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class DeadLift extends AbstractExerciseClass {

    public DeadLift(ExerciseGoal exerciseGoal){
        super("Dead Lift", DifficultyOfExercise.ELITE, new ArrayList<>(Arrays.asList(MuscleGroup.BACK, MuscleGroup.HAMSTRING)), new ArrayList<>(Arrays.asList(MuscleGroup.CHEST, MuscleGroup.QUADRICEP)), exerciseGoal, ExerciseType.LENGTHENING);
    }

}
