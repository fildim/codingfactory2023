package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * λαμβανει a , b , c τιμες απο το χρηστη με την a ως υποτεινουσα ενος τριγωνου
 * ελεγχει αν το τριγωνο ειναι ορθογωνιο
 * δλδ a^2==b^2+c^2
 */

public class RightTriangleApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert values for a, b, and c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a * 2 - b * 2 - c * 2) < EPSILON) {
            isRight = true;
            System.out.println("Triangle is right");
        } else {
            System.out.println("Triangle is not right");
        }



    }
}
