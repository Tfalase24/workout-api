package com.example.demo.Split;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public interface SplitInterface {

    String pickATypeOfWorkout();

    @PostConstruct
    default void chooseYourWorkout(){
        System.out.println("Split has been created, choose your workout");
    }

    @PreDestroy
    default void endOfWorkout(){
        System.out.println("Workout has ended");
    }
}
