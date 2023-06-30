package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το a ^ b
 */

public class PowerApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int i = 1;
        int result = 1;

        System.out.println("Please insert a and b");
        a = scanner.nextInt();
        b = scanner.nextInt();


        while (i <= b)
        {
            result = result * a;
            i++;
        }

        System.out.printf("%d ^ %d = %d", a, b, result);

    }
}
