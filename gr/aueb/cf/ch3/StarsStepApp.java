package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δίνει ο χρήστης start, end και step
 * και εκτυπώνει αντίστοιχα αστεράκια
 */

public class StarsStepApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int i = 0;


        System.out.println("Please insert start, end and step values");
        start = scanner.nextInt();
        end = scanner.nextInt();
        step = scanner.nextInt();

        i = start;

        while (i <= end)
        {
            System.out.println("*");
            i = i + step;
        }


    }
}
