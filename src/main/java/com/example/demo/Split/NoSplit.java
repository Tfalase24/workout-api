package com.example.demo.Split;

import org.springframework.stereotype.Component;

@Component
public class NoSplit implements Split {

    @Override
    public String pickATypeOfWorkout() {
        return "No Default";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
