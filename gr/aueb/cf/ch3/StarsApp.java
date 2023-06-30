package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εκτυπώνει n οριζόντια αστεράκια,
 * όπου n ένας ακέραιος από το χρήστη.
 */

public class StarsApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 1;

        System.out.println("Please insert number of stars");
        numberOfStars = scanner.nextInt();

        while (i <= numberOfStars)
        {
            if ((i % 50) == 0)
            {
                System.out.println();
            }
            System.out.print("*");
            i++;

        }

    }
}
