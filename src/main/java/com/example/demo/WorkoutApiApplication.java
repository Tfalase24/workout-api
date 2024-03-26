package com.example.demo;

import com.example.demo.exercise.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
			readExerciseFromDatabase(exerciseDAO);
			readExerciseFromDatabaseByMuscleGroup(exerciseDAO, MuscleGroup.QUADRICEP);
			System.out.println("Command Line Runner has ended");
		};
	}

	private void addExerciseToDatabase(ExerciseDAO exerciseDAO){
		System.out.println("Creating new exercise object");
		Exercise squat = new Exercise("Squat", DifficultyOfExercise.MEDIUM, MuscleGroup.QUADRICEP, MuscleGroup.HAMSTRING, ExerciseType.SHORTENING);
		System.out.println("Saving the Exercise");
		exerciseDAO.save(squat);
	}

	private void readExerciseFromDatabase(ExerciseDAO exerciseDAO){
		System.out.println("Reading table now");
		Exercise responseExercise = exerciseDAO.findExercise("SQUAT");
		System.out.println(responseExercise);
		System.out.println("Finished reading table");
	}

	private void readExerciseFromDatabaseByMuscleGroup(ExerciseDAO exerciseDAO, MuscleGroup muscleGroup){
		System.out.println("Reading table and searching for exercise of: " +  muscleGroup);
		Exercise responseExercise = exerciseDAO.findByMuscleGroup(muscleGroup);
		System.out.println(responseExercise);
		System.out.println("Finished reading the table again");
	}
}
