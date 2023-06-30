package testbed.ch8;

import java.util.Scanner;

public class Exercise {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        while (true) {


            printMenu();

            choice = getChoice();

            if (choice == 5) {

                System.out.println("Goodbye!");
                return;
            }

            try {

                printChoice(choice);

            } catch (IllegalArgumentException e) {

                System.out.println("Not an option...");
            }
        }
    }


    public static void printChoice (int choice)  throws IllegalArgumentException {

        switch (choice) {
            case 1:
                System.out.println("First choice");
                break;
            case 2:
                System.out.println("Second Choice");
                break;
            case 3:
                System.out.println("Third choice");
                break;
            case 4:
                System.out.println("Fourth choice");
                break;
            case 5:
                System.out.println("Exit");
                return;
            default:
                throw new IllegalArgumentException();

        }
    }


    /**
     * user provides an int as his choice for the menu
     * @return int as choice
     */
    public static int getChoice()   {

        while (true) {

            System.out.println("Please provide your choice");

            if (in.hasNextInt()) {

                return in.nextInt();
            } else {

                System.out.println("Invalid input");
                in.nextLine();
            }
        }

    }


    /**
     * prints a menu of choices for the user
     */
    public static void printMenu()   {

        System.out.println("Please choose one of the following: ");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. Exit");

    }
}
