package testbed.ch5;

import java.util.Scanner;

/**
 * prints a menu for the user to choose how to print the provided number of stars
 */
public class PrintStarsMenuApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        int n = 0;

        do {
            printMenu();
            choice = getChoice();

            if (choice < 1 || choice > 6)   {
                System.out.println("Invalid choice");
                continue;
            }
            if (choice == 6)    {
                System.out.println("Goodbye");
                break;
            }

            n = getNumberOfStars();
            printStars(choice, n);
        } while (true);

    }

    /**
     * prints a menu of choices for the user
     */
    public static void printMenu()   {

        System.out.println("Please choose one of the following: ");
        System.out.println("1. Print n stars horizontally");
        System.out.println("2. Print n stars vertically");
        System.out.println("3. Print n lines of n stars each");
        System.out.println("4. Print n lines from 1 to n stars");
        System.out.println("5. Print n lines from n to 1 stars");
        System.out.println("6. Exit");

    }

    /**
     * user provides an int as his choice for the menu
     * @return int as choice
     */
    public static int getChoice()   {

        System.out.println("Please provide your choice");
        return in.nextInt();

    }

    /**
     * user provides an int as the number of stars to print
     * @return int as number of stars
     */
    public static int getNumberOfStars()    {

        System.out.println("Please provide n");
        return in.nextInt();

    }

    /**
     * prints stars depending on the choice of the user
     * @param choice
     */
    public static void printStars(int choice, int n)   {

        switch (choice) {
            case 1:
                printStarsHorizontally(n);
                System.out.println();
                break;
            case 2:
                printStarsVertically(n);
                break;
            case 3:
                printStarsNxN(n);
                System.out.println();
                break;
            case 4:
                printStarsChoice4(n);
                break;///
            case 5:
                printStarsChoice5(n);  //δε ξερω πως να την ονομασω...
                break;
        }
    }

    /**
     * prints n stars horizontally
     * @param n
     */
    public static void printStarsHorizontally(int n)   {

        for (int i = 1; i <= n; i++)    System.out.print("*");
    }

    /**
     * prints n stars vertically
     * @param n
     */
    public static void printStarsVertically(int n)  {

        for (int i = 1; i <= n; i++)        System.out.println("*");
    }

    /**
     * prints n lines of n stars each
     * @param n
     */
    public static void printStarsNxN(int n) {

        for (int i = 1; i <= n; i++)    printStarsHorizontally(n);
    }

    /**
     * prints n lines of * starting with 1 star and ending with n
     * @param n number of lines
     */
    public static void printStarsChoice4(int n) {

        for (int i = 1; i <= n; i++) {
            printStarsHorizontally(i);
            System.out.println();
        }
    }

    /**
     * prints n lines * starting with n and ending with 1
     * @param n number of lines
     */
    public static void printStarsChoice5(int n) {

        for (int i = n; i > 0; i--) {
            printStarsHorizontally(i);
            System.out.println();
        }
    }

}
