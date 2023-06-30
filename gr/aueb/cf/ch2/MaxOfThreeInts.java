package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει 3 ακεραίους
 * και βρίσκουμε το μεγαλύτερο
 */

public class MaxOfThreeInts
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert 3 ints");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.printf("Max between %d, %d, %d is %d", num1, num2, num3, Math.max(num1, Math.max(num2,num3)));
    }
}
