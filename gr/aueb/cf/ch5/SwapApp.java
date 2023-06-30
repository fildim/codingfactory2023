package gr.aueb.cf.ch5;

/**
 * ανταλλασσει αμοιβαια 2 τιμες που δινει ο χρηστης
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

        System.out.println("a = " + a + " b = " + b);
    }

    /**
     * swaps a, b values
     * @param a     first value
     * @param b     second value
     */
    public static void swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }


}
