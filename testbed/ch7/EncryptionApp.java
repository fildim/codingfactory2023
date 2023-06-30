package testbed.ch7;

import java.util.Scanner;

/**
 * Creates an encrypted version of a given string
 */
public class EncryptionApp {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String str;
        String encrypted = "";
        int ordinal = 0;

        System.out.println("please insert a string to encrypt");
        str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {

            ordinal = (int) str.charAt(i) + 1;          //παιρνουμε το ordinal του καθε char και το αυξανουμε κατα 1
            encrypted = encrypted + (char) ordinal;     //προσθετουμε στο τελος της καινουριας string το χαρακτηρα που προκυπτει
        }

        System.out.println("encrypted " + str + " to " + encrypted);

    }
}
