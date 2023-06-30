package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει δευτερόλεπτα σε Days,
 * Hours, Minutes and Seconds
 */

public class SecondsDemo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        final int DAY_SECS = 24 * 3600;
        final int HOUR_SECS = 3600;
        final int MINUTE_SECS = 60;
        int input_Seconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int remainingSeconds = 0;

        System.out.println("Please insert the total amount of seconds");
        input_Seconds = scanner.nextInt();

        remainingSeconds = input_Seconds;

        days = remainingSeconds / DAY_SECS;
//      remainingSeconds = remainingSeconds % DAY_SECS;
        remainingSeconds %= DAY_SECS;

        hours = remainingSeconds / HOUR_SECS;
        remainingSeconds %= HOUR_SECS;

        minutes = remainingSeconds / MINUTE_SECS;
        remainingSeconds %= MINUTE_SECS;

        System.out.printf("%,d seconds = %d days, %d hours, %d minutes, %d seconds", input_Seconds, days, hours, minutes, remainingSeconds);


    }
}
