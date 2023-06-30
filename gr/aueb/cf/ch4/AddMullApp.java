package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * προσθετει και πολλαπλασιαζει n πρωτους ακεραιους
 * το n το δινει ο χρηστης
 */
public class AddMullApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a num");
        n = in.nextInt();

        for ( int i = 1; i <= n; i++)
            //δηλωνεται το i μονο για τη for
            //και οταν τελεωνει η for χανεται και το i
            //ισχυει για οτι δηλωνεται μεσα στη for!!!!
        {
            sum += n;
            result *= n;
        }

        System.out.println("Sum: " + sum);
        System.out.printf("Mul: %,d", result);

    }
}
