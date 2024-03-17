package com.example.demo.exercise;

import jakarta.persistence.*;
import java.util.Locale;
import java.util.Set;

@Entity
@Table(name="exercise")
public class ExerciseClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String nameOfExercise;
    @Column(name="difficulty")
    @Enumerated(EnumType.STRING)
    private DifficultyOfExercise difficultyOfExercise;
    @Column(name="muscle_group")
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = MuscleGroup.class)
    @CollectionTable(name = "exercise_muscle_group", joinColumns = @JoinColumn(name = "exercise_id"))
    private Set<MuscleGroup> muscleGroup;
    @Column(name="antagonist_muscle_group")
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = MuscleGroup.class)
    @CollectionTable(name = "exercise_muscle_group", joinColumns = @JoinColumn(name = "exercise_id"))
    private Set<MuscleGroup> antagonistMuscleGroup;
    @Column(name="exercise_type")
    private ExerciseType exerciseType;


    public ExerciseClass(){}
    public ExerciseClass(long id, String nameOfExercise, DifficultyOfExercise difficultyOfExercise, Set<MuscleGroup> muscleGroup, Set<MuscleGroup> antagonistMuscleGroup, ExerciseType exerciseType) {
        this.id = id;
        this.nameOfExercise = nameOfExercise.toUpperCase(Locale.ROOT);
        this.difficultyOfExercise = difficultyOfExercise;
        this.muscleGroup = muscleGroup;
        this.antagonistMuscleGroup = antagonistMuscleGroup;
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

    public Set<MuscleGroup> getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(Set<MuscleGroup> muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public Set<MuscleGroup> getAntagonistMuscleGroup() {
        return antagonistMuscleGroup;
    }

    public void setAntagonistMuscleGroup(Set<MuscleGroup> antagonistMuscleGroup) {
        this.antagonistMuscleGroup = antagonistMuscleGroup;
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
}
