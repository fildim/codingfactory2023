package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει ή όχι,
 * με βάση αν βρέχει και ταυτόχρονα η θερμοκρασία είναι κάτω από μηδέν.
 */

public class SnowingApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isSnowing = false;
        boolean isRaining = false;

        System.out.println("Please insert if it raining(true / false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert temperature");
        temp = scanner.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);

    }
}
