package br.target;

import java.util.ArrayList;

public class ExerciseFive {
    static void reverseWord(String wordOne) {
        ArrayList<Character> inverseWord = new ArrayList<Character>();
        for (int i = 0; i < wordOne.length() ; i++) {
            inverseWord.add(wordOne.charAt(i));
        }

        int wordlenght = inverseWord.size()-1;

        for (int i = wordlenght; i >= 0; i--) {
            System.out.print(inverseWord.get(i));
        }
    }
}
