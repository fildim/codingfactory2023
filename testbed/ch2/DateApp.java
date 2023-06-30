package testbed.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει τα day, month, year σε
 * dd/mm/yyyy.
 */

public class DateApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int day = 0, month = 0, year = 0;

        System.out.printf("Input day of month\n");
        day = in.nextInt();

        System.out.printf("Input month of year\n");
        month = in.nextInt();

        System.out.printf("Input year\n");
        year = in.nextInt();

        System.out.printf("The date you have input is %02d/%02d/%02d", day , month , year % 100);

    }
}
