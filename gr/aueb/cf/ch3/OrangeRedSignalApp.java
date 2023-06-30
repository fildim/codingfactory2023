package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένα αεροσκάφος έχει 2 δεξαμενές.
 * Αν μία από τις 2 έχει λιγότερο από 1/4 καύσιμα τότε ανάβει πορτοκαλί σήμα.
 * Αν και οι 2 έχουν < 1/4 καύσιμα τότε ανάβει κόκκινο.
 * Ο χρήστης δίνει true ή false ανάλογα αν tank < 1 / 4 ή όχι αντίστοιχα.
 */

public class OrangeRedSignalApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1 , tank2 are less than 1/4");
        isTank1LTQuarter = scanner.nextBoolean();
        isTank2LTQuarter = scanner.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);


    }
}
