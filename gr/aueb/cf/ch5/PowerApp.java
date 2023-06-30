package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υπολογιζει το a^n
 */
public class PowerApp {
    public static void main(String[] args) {
        int a = 0;
        int n = 0;
        int result = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("please provide a and n");
        a = in.nextInt();
        n = in.nextInt();

        result = pow(a, n);

        System.out.println("a ^ n: " + result);

    }

    /**
     * calculates power of an int
     * @param a     base number
     * @param n     power to raise
     * @return      a ^ n
     */
    public static int pow (int a, int n){
        int power = 1;
        for (int i = 1; i <= n; i++){
            power *= a;
        }

        return power;
    }

}
