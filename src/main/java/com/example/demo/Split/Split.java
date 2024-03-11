package com.example.demo.Split;

import com.example.demo.Workout.Workout;
import jakarta.annotation.PostConstruct;

public interface Split {

    String pickATypeOfWorkout();

    @PostConstruct
    default void chooseYourWorkout(){
        System.out.println("Split has been created");
    };
}
