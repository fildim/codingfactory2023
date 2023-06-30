package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptApp2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int MAGIC_NUM = 12;

        while (true) {

                System.out.println("Please insert a num");

                if (in.hasNextInt()) {

                    inputNum = in.nextInt();
                } else {

                    in.nextLine();
                    System.out.println("error.not an int");
                    continue;
                }

                if (inputNum == MAGIC_NUM) {

                    System.out.println("great!");
                    break;
                }
        }

        System.out.println("thanks for using the magic app");
    }
}
