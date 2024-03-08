package com.example.demo.Split;

import com.example.demo.Workout.Workout;
import org.springframework.stereotype.Component;

@Component
public class PushPullLegsSplit implements Split{

    @Override
    public String pickATypeOfSplit() {
        return "Push Workout";
    }

    @Override
    public String toString(){
        return "Push Split";
    }
}
