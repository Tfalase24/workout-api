package com.example.demo.Workout;

import com.example.demo.exercise.ExerciseClass;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="workout")
public class WorkoutClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TypeOfWorkout typeOfWorkout;
    @Column(name = "exercises")
    @ElementCollection(targetClass = ExerciseClass.class)
    List<ExerciseClass> exercises;

    public WorkoutClass() {
    }

    public WorkoutClass(TypeOfWorkout typeOfWorkout) {
        this.typeOfWorkout = typeOfWorkout;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(ExerciseClass exercise){
        exercises.add(exercise);
    }

}
