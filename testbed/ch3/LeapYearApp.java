package testbed.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν το έτος που εισήγαγε ο χρήστης είναι δίσεκτο.
 * (Ισχύει για μετά το 400;;)
 */

public class LeapYearApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean leapYear = false;

        System.out.print("Please insert a year\n");
        year = in.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.printf("%d is a leap year", year);
        }
        else {
            System.out.printf("%d is not a leap year", year);
        }
    }



}
