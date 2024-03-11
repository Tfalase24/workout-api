package com.example.demo.Split;

import com.example.demo.Workout.WorkoutInterface;
import org.springframework.stereotype.Component;

@Component
public class PushPullLegsSplit implements SplitInterface {

    private WorkoutInterface workout;

    @Override
    public String pickATypeOfWorkout() {
        return "Default is Push";
    }

}
