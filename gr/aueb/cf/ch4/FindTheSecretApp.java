package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * ο χρηστης εχει δεκα ευκαιριες για να βρει ενα μυστικο αριθμο
 * αν το βρει νωριτερα απο τη 10η φορα, η for θα πρεπει να σταματησει
 */
public class FindTheSecretApp
{
    public static void main(String[] args)
    {
        final int SECRET_KEY = 12;
        int num = 0;
        Scanner in = new Scanner(System.in);
        boolean found = false;

        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Please make a guess");
            num = in.nextInt();

            if (num == SECRET_KEY)
            {
                found = true;
                break;
            }

        }

        if (!found)
        {
            System.out.println("No worries, play again!");
            System.exit(1);
        }

        System.out.println("Success! Play again!");
    }
}
