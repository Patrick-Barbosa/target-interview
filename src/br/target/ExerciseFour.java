package br.target;
public class ExerciseFour {

    static void percentagesEstates() {
        double sP, rJ, mG, eS, others;
        sP = 67836.43d;
        rJ = 36836.43d;
        mG = 29229.88d;
        eS = 27165.48d;
        others = 19849.53d;

        double sum = (sP + rJ + mG + eS + others);

        System.out.println("The percentage of SP is: " + (sP*100)/sum);
        System.out.println("The percentage of RJ is: " + (rJ*100)/sum);
        System.out.println("The percentage of MG is: " + (mG*100)/sum);
        System.out.println("The percentage of ES is: " + (eS*100)/sum);
        System.out.println("The percentage of others is: " + (others*100)/sum);


    }




}
