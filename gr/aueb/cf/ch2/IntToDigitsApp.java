package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα διψήφιο ακέραιο
 * και βρίσκουμε το άθροισμα των 2 ψηφίων
 */

public class IntToDigitsApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;

        System.out.println("Please insert a number with two digits");
        num = scanner.nextInt();

        leftDigit = num / 10;
        rightDigit = num % 10;

        sumOfDigits = leftDigit + rightDigit;

        System.out.printf("Sum: %d", sumOfDigits);


    }
}
