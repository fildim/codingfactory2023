package gr.aueb.cf.ch5;

/**
 * υπολογιζει το a ^ n αναδρομικα
 */
public class PowerRecursiveApp {
    public static void main(String[] args) {
        int a = 2;
        int b = -3;
        System.out.println(power(a, b));
    }

    /**
     * calculates a ^ b
     * @param a     base
     * @param b     power
     * @return      a ^ b
     */
    public static float power (float a, float b) {

        if (b < 0) {
            return 1 / power(a, -b);
        }

        if (b == 0) return 1;

        return a * power(a, b - 1); 
    }
}
