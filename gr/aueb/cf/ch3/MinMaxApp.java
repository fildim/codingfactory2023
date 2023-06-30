package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * βρισκει το min και το max δυο  αριθμων που δινει ο χρηστης
 */

public class MinMaxApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;
        int max = 0;

        System.out.println("Please provide two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 < num2)
        {
            min = num1;
            max = num2;
        }
        else if (num1 > num2)
        {
            min = num2;
            max = num1;
        }
        else
        {
            System.out.println("Nums are equal");
            min = num1;
            max = min;
        }

        System.out.println("Min:" + min);
        System.out.println("Max: "+ max);


    }
}
