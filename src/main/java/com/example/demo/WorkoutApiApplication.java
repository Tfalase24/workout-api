package com.example.demo;

import com.example.demo.exercise.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class WorkoutApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ExerciseDAO exerciseDAO){
		return runner -> {
			System.out.println("Command Line Runner has started");
			addExerciseToDatabase(exerciseDAO);
			System.out.println("Command Line Runner has ended");
		};
	}

	private void addExerciseToDatabase(ExerciseDAO exerciseDAO){
		System.out.println("Creating new exercise object");
		ExerciseClass squat = new ExerciseClass("Squat", DifficultyOfExercise.MEDIUM, new HashSet<>(Set.of(MuscleGroup.GLUTE, MuscleGroup.QUADRICEP)), new HashSet<>(Set.of(MuscleGroup.HAMSTRING, MuscleGroup.CALF)), ExerciseType.SHORTENING);
		System.out.println("Saving the Exercise");
		exerciseDAO.save(squat);
	}
}
