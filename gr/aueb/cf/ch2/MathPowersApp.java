package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Βρίσκει το τετράγωνο και το κύβο
 * ενός ακεραίου που δίνει ο χρήστης
 */

public class MathPowersApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please input a number");
        inputNum = scanner.nextInt();

        System.out.printf("num: %d, square: %d, cube: %d", inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum, 3));


    }
}
