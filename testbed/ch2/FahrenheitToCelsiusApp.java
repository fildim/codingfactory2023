package testbed.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει θερμοκρασία fahrenheit σε celsius.
 */

public class FahrenheitToCelsiusApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tempInFahrenheit = 0, tempInCelsius = 0;


        System.out.printf("Input temp in Fahrenheit\n");
        tempInFahrenheit = in.nextInt();

        tempInCelsius = 5 * (tempInFahrenheit - 32) / 9;

        System.out.printf("Temp in Celsius: %d",  tempInCelsius);

    }
}
