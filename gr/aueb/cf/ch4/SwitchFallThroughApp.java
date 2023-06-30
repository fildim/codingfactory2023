package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * λαμβανει ενα grade απο το χρηστη και δινει feedback αναλογα (καλως,λιαν καλως,κτλ)
 */

public class SwitchFallThroughApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please provide a grade");
        grade = in.nextInt();

        switch (grade)
        {
            case 1:     //χωρις break περναει στην επομενη case
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error");
                break;

        }

    }
}
