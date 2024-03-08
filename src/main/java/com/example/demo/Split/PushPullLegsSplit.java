package com.example.demo.Split;

import com.example.demo.Workout.Workout;
import org.springframework.stereotype.Component;

@Component
public class PushPullLegsSplit implements Split{

    @Override
    public String pickATypeOfWorkout() {
        return "Push Workout";
    }

}
