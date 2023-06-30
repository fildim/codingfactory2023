package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάση τη θερμοκρασία που δίνει ο χρήστης.
 * Σν είναι < 0 τότε χιονίζει, αλλιώς όχι.
 */

public class TemperatureApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = scanner.nextInt();

        isSnowing = (temp < 0) ;

        System.out.println("Is snowing: " + isSnowing);


    }
}
