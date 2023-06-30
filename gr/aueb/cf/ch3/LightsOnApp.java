package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα φώτα ενός αυτοκινήτου με βάση 3 μεταβλητές:
 * Αν βρέχει και ταυτόχρονα ισχύει ένα τουλάχιστον από τα επόμενα:
 * Είναι σκοτάδι ή τρέχουμε (ταχύτητα > 100).
 * Τις τιμές αυτές τις εισάγει ο χρήστης.
 */

public class LightsOnApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining (true / false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert if it is dark (true / false)");
        isDark = scanner.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = scanner.nextInt();

        isRunning = (speed > MAX_SPEED);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on: " + lightsOn);



    }
}
