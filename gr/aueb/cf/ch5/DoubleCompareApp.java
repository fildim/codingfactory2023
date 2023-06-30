package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * ελεγχει ισοτητα και ανισοτητα στους δεκαδικους
 */
public class DoubleCompareApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double d1 = 0.0;
        double d2 = 0.0;
        final double EPSILON = 0.005;       //ειναι η διαφορα που θεωρουμε σημαντικη ωστε να τους θεωρησουμε ανισους

        System.out.println("Please insert two doubles");
        d1 = in.nextDouble();
        d2 = in.nextDouble();


        if (Math.abs(d2 - d1) <= EPSILON){
            System.out.println("EQUAL");
        }
        else{
            System.out.println("NOT equal");
        }

    }
}
