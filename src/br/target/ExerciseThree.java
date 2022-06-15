package br.target;
import java.util.Collections;
import java.util.LinkedList;

public class ExerciseThree{
    static LinkedList<Double> monthData = new LinkedList<Double>();
    static LinkedList<Double> monthDataFiltered = new LinkedList<Double>();

    // Não sei usar JSON, portanto, inseri os dados manualmente.
    public static void readData () {
        Collections.addAll(monthData, 700.81d, 981.81d, 891.18d, 881.81d, 982.61d, 0d, 0d,
                                                815.14d, 741.22d, 745.25d, 687.52d, 745.45d, 0d, 0d,
                                                142.2d, 0d, 745.6d, 887.14d, 476d, 0d, 0d,
                                                991.25d, 981.812d, 891.81d, 0d, 982.88d, 0d, 0d,
                                                816.94d, 681.14d, 891.97d);

        for (double lista : monthData) {
            if (lista != 0.0d) {
                monthDataFiltered.add(lista);
            }
        }
    }

    public static double lowerValue() {
        double lowestValue = monthDataFiltered.get(0);
        for (double list : monthDataFiltered) {
            if (lowestValue > list) {
                lowestValue = list;
            }
        }
        return lowestValue;
    }

    public static double higherValue(){
        double highestValue = monthDataFiltered.get(0);
        for (double list : monthData) {
            if (highestValue < list) {
                highestValue = list;
            }
        }
        return highestValue;
    }

    public static double higherThanAverage () {
        double total = 0;
        int aboveAverage = 0;
        double average;

        for (double list : monthDataFiltered) {
            total += list;
        }
        average = total/monthDataFiltered.size();
        for (double list : monthDataFiltered) {
            if (list > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
