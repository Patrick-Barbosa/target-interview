package br.target;

public class Main {
    public static void main(String[] args) {
        //Exercise Two
        System.out.print("Exercise Two.\nThe number seven ");
        System.out.println(ExerciseTwo.inFibonacci(7) + ".");

        //Exercise Three
        ExerciseThree.readData();
        System.out.println("\n\nExercise Three.\nThe lowest value is: " + ExerciseThree.lowerValue() + ".");
        System.out.println("The highest value is: " + ExerciseThree.higherValue() + ".");
        System.out.println("Have " + ExerciseThree.higherThanAverage() + " numbers above the average.\n\n");

        //Exercise Four
        System.out.println("Exercise Four.\n");
        ExerciseFour.percentagesEstates();

        //Exercise Five
        System.out.println("\n\nExercise Five.");
        System.out.print("The inverse of word (palavra) is: ");
        ExerciseFive.reverseWord("palavra");
    }
}