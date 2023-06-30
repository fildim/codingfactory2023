package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringInputApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("please provide a string");
//        s = in.next();  //ends with whitespace (space, tab, new line)
        s = in.nextLine();  //ends with new line

        System.out.println(s);

    }
}
