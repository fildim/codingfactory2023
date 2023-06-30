package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δείχνει τη χρήση break και continue.
 */

public class BreakContinueApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;


        while (true)
        {
            System.out.println("Please provide a num");
            num = in.nextInt();
            boolean found = false;

            if (num == 5)
            {
                continue;
            }

            sum += num;

            if (num == 10)
            {
//                System.out.println("Bingo!!");
                found = true;
                break;
            }

        }

        System.out.println("Sum: " + sum);

    }
}
