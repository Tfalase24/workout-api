package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class AbstractExerciseClass {

    private String nameOfExercise;
    private DifficultyOfExercise difficultyOfExercise;
    private List<MuscleGroup> muscleGroup;
    private List<MuscleGroup> antagonistMuscleGroup;
    private ExerciseGoal exerciseGoal;
    private ExerciseType exerciseType;
    private int sets;
    private int reps;


    public AbstractExerciseClass(){}
    public AbstractExerciseClass(String nameOfExercise, DifficultyOfExercise difficultyOfExercise, List<MuscleGroup> muscleGroup, List<MuscleGroup> antagonistMuscleGroup, ExerciseGoal exerciseGoal, ExerciseType exerciseType) {
        this.nameOfExercise = nameOfExercise.toUpperCase(Locale.ROOT);
        this.difficultyOfExercise = difficultyOfExercise;
        this.muscleGroup = muscleGroup;
        this.antagonistMuscleGroup = antagonistMuscleGroup;
        this.exerciseGoal = exerciseGoal;
        this.exerciseType = exerciseType;
        this.sets = setSets(exerciseGoal);
        this.reps = setReps(exerciseGoal);
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

    private int setSets(ExerciseGoal exerciseGoal){
        int sets = 0;
        switch(exerciseGoal){
            case BODYBUILDING -> sets = 6;
            case STRENGTH -> sets = 5;
            case POWER -> sets = 3;
            case ENDURANCE -> sets = 4;
            case WEIGHTLOSS -> sets = 8;
        }
        return sets;
    }


    private int setReps(ExerciseGoal exerciseGoal) {
        int reps = 0;
        switch(exerciseGoal){
            case BODYBUILDING -> reps = 12;
            case STRENGTH -> reps = 6;
            case POWER -> reps = 5;
            case ENDURANCE -> reps = 16;
            case WEIGHTLOSS -> reps = 10;
        }
        return reps;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    @Override
    public String toString() {
        return "This exercise is the %s, perform %d reps for %d sets (%s reps and sets)".formatted(getNameOfExercise(), getReps(), getSets(), getExerciseGoal());
    }

}
