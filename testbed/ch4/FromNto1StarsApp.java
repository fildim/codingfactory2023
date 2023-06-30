package testbed.ch4;

import java.util.Scanner;

/**
 * prints from N to 1 stars based on a number provided from stdin
 */
public class FromNto1StarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please provide an int");
        n = in.nextInt();

        for (int i = n ; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
