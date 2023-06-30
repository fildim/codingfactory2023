package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts Euros to US dollars.
 * User input (stdin) is Euros.
 * App output is the same amount in US dollars. *
 */

public class EuroToUsdConverterApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        System.out.println("Please insert an amount in Euros");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;


        System.out.printf("%d euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);

    }

}
