package com.example.demo.Split;

import com.example.demo.Workout.Workout;
import org.springframework.stereotype.Component;

@Component
public class PushPullLegsSplit implements Split{

    private Workout workout;

    @Override
    public String pickATypeOfWorkout() {
        return "Default is Push";
    }

}
