package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υπολογιζει το παραγοντικο του n με τη μεθοδο facto
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int result = 0;

        System.out.println("please provide n");
        n = in.nextInt();

        result = facto(n);

        System.out.println("n!: " + result);
    }

    /**
     * returns n!
     * @param n     the number 'n' of n!
     * @return      1 * 2 * 3 * ... * n
     */
    public static int facto (int n) {
        int result = 1;

        for (int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }

}
