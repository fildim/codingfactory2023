package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * demonstrates the usage of exceptions
 */
public class ExceptApp {

    public static void main(String[] args) {

        int ch = getNextChar();

    }

    public static int getNextChar() {

        int ch = ' ';

        try {

            ch = System.in.read();
        } catch (IOException e) {

            e.printStackTrace();
        }

        return ch;
    }
}
