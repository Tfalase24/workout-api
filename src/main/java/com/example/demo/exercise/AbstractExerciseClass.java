package com.example.demo.exercise;

import java.util.List;
import java.util.Locale;

public abstract class AbstractExerciseClass {

    private String nameOfExercise;
    private DifficultyOfExercise difficultyOfExercise;
    private List<MuscleGroup> muscleGroup;
    private List<MuscleGroup> antagonistMuscleGroup;
    private ExerciseGoal exerciseGoal;
    private ExerciseType exerciseType;


    public AbstractExerciseClass(){}
    public AbstractExerciseClass(String nameOfExercise, DifficultyOfExercise difficultyOfExercise, List<MuscleGroup> muscleGroup, List<MuscleGroup> antagonistMuscleGroup, ExerciseGoal exerciseGoal, ExerciseType exerciseType) {
        this.nameOfExercise = nameOfExercise.toUpperCase(Locale.ROOT);
        this.difficultyOfExercise = difficultyOfExercise;
        this.muscleGroup = muscleGroup;
        this.antagonistMuscleGroup = antagonistMuscleGroup;
        this.exerciseGoal = exerciseGoal;
        this.exerciseType = exerciseType;
    }


    public String getNameOfExercise() {
        return nameOfExercise;
    }

    public void setNameOfExercise(String nameOfExercise) {
        this.nameOfExercise = nameOfExercise;
    }

    public DifficultyOfExercise getDifficultyOfExercise() {
        return difficultyOfExercise;
    }

    public void setDifficultyOfExercise(DifficultyOfExercise difficultyOfExercise) {
        this.difficultyOfExercise = difficultyOfExercise;
    }

    public List<MuscleGroup> getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(List<MuscleGroup> muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public List<MuscleGroup> getAntagonistMuscleGroup() {
        return antagonistMuscleGroup;
    }

    public void setAntagonistMuscleGroup(List<MuscleGroup> antagonistMuscleGroup) {
        this.antagonistMuscleGroup = antagonistMuscleGroup;
    }

    public ExerciseGoal getExerciseGoal() {
        return exerciseGoal;
    }

    public void setExerciseGoal(ExerciseGoal exerciseGoal) {
        this.exerciseGoal = exerciseGoal;
    }

    public ExerciseType getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(ExerciseType exerciseType) {
        this.exerciseType = exerciseType;
    }

}
