package testbed.ch7;

import java.util.Scanner;

/**
 * Creates a decrypted version of a given string
 */
public class DecryptionApp {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String str;
        String decrypted = "";
        int ordinal = 0;

        System.out.println("please insert a string to decrypt");
        str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {

            ordinal = (int) str.charAt(i) - 1;      //παιρνουμε το ordinal του καθε char και το μειωνουμε κατα 1
            decrypted = decrypted + (char) ordinal; //προσθετουμε στο τελος της καινουριας string το χαρακτηρα που προκυπτει
        }

        System.out.println("decrypted " + str + " to " + decrypted);
    }
}
