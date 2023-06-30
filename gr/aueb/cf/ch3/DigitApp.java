package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου,
 * το άθροισμα των ψηφίων
 * και το άθροισμα του πρώτου και του τελευταίου ψηφίου.
 */
public class DigitApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int leftMostDigit = 0;
        int rightMostDigit = 0;


        System.out.println("Please give a number");
        inputNum = in.nextInt();

        num = inputNum;

        do
        {
            count++;
            currentDigit = num % 10;
            sum = sum + currentDigit;
            if (count == 1)
            {
                rightMostDigit = currentDigit;
            }
            num = num / 10;
        } while (num != 0);

        leftMostDigit = currentDigit;
        sumLeftRight = leftMostDigit + rightMostDigit;

        System.out.println("Count: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Leftmost and rightmost digits sum: " + sumLeftRight);

    }
}
