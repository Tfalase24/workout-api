package com.example.demo.exercise;

public abstract class AbstractExerciseClass {

    String nameOfExercise;
    DifficultyOfExercise difficultyOfExercise;
    MuscleGroup muscleGroup;
    MuscleGroup antagonistMuscleGroup;
    ExerciseGoal exerciseGoal;
    ExerciseType exerciseType;
    int numberOfSets;
    int numberOfReps;

    public AbstractExerciseClass(String nameOfExercise, DifficultyOfExercise difficultyOfExercise, MuscleGroup muscleGroup, MuscleGroup antagonistMuscleGroup, ExerciseGoal exerciseGoal, ExerciseType exerciseType, int numberOfSets, int numberOfReps) {
        this.nameOfExercise = nameOfExercise;
        this.difficultyOfExercise = difficultyOfExercise;
        this.muscleGroup = muscleGroup;
        this.antagonistMuscleGroup = antagonistMuscleGroup;
        this.exerciseGoal = exerciseGoal;
        this.exerciseType = exerciseType;
        this.numberOfSets = numberOfSets;
        this.numberOfReps = numberOfReps;
    }
}
