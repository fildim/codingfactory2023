package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * ενας μικρος βατραχος θελει να περασει ενα ποταμι
 * ο frog βρισκεται στη θεση x
 * και θελει να φτασει στη θεση y ή σε θεση μεγαλυτερη του y
 * frog jumps a fixed distance (d)
 * βρισκει τον ελαχιστο αριθμο jumps που ο frog πρεπει να κανει για να φτασει στο στοχο ή να τον ξεπερασει
 * πχ αν εχουμε x = 10, y = 85, d =30 τοτε ο frog θα χρειαστει 3 jumps
 * γιατι θα ξεκινησει απο 10, παει στο 40, παει στο 70, παει στο 100 οποτε εχει επιτελεσει το σκοπο του
 */

public class FrogApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int startingPosition = 0;
        int targetPosition = 0;
        int jumpDistance = 0;
        int numberOfJumps = 0;

        System.out.println("Please provide starting position, target position and jump distance");
        startingPosition = in.nextInt();
        targetPosition = in.nextInt();
        jumpDistance = in.nextInt();

        for (int i = startingPosition; i < targetPosition ; i += jumpDistance)
        {
            numberOfJumps++;
        }

        System.out.println("Jumps needed: " + numberOfJumps);

        //χωρις loop, για βελτιστοποιηση και ταχυτητα
        numberOfJumps = (int) Math.ceil( (targetPosition - startingPosition) / (double) jumpDistance);
        System.out.println("Jumps needed: " + numberOfJumps);
    }
}
