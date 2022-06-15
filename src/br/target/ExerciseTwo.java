package br.target;

import java.util.ArrayList;

public class ExerciseTwo {
    static int i = 1;
    static ArrayList<Integer> fibonacci = new ArrayList<Integer>();
    public static String inFibonacci(int input) {
        fibonacci.add(0);
        fibonacci.add(1);

        while ( fibonacci.size() < 30 ) {
            fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));
            if (fibonacci.get(i-1) == input || fibonacci.get(i) == input) {
                return "are in the sequence of Fibonacci";
            }
                i++;
        }
            return "aren't in the sequence of Fibonacci";
    }
}
