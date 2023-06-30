package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * αποφασιζει αν ενας int ειναι αρτιος ή περιττός
 */
public class EvenOddApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean isNumEven = false;

        System.out.println("Please provide an int");
        num = in.nextInt();

        isNumEven = isEven(num);

        System.out.println("Num " + num + " is even: " + isNumEven);

    }

    /**
     * evaluates an int as even or odd
     * @param n     the number to evaluate
     * @return      true if even, false if odd
     */
    public static boolean isEven (int n) {
        return n % 2 != 0;
    }





}
