package com.example.demo.exercise;

import java.util.List;

public interface ExerciseDAO {

    void save(Exercise exercise);

    Exercise findExerciseByName(String name);

    Exercise findByMuscleGroup(MuscleGroup muscleGroup);

    List<Exercise> findAllExercisesByMuscleGroup(MuscleGroup muscleGroup);

    List<Exercise> findAllExercisesByAntagonistMuscleGroup(MuscleGroup muscleGroup);

    List<Exercise> findAllExercisesByDifficulty(DifficultyOfExercise difficultyOfExercise);

    List<Exercise> findAllExercisesByExerciseType(ExerciseType exerciseType);

    void updateExercise(Exercise exercise);

    void deleteExercise(String name);


}
