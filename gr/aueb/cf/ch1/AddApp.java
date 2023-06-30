package gr.aueb.cf.ch1;

/**
 * Adds two ints
 */
public class AddApp
{
    public static void main(String[] args)
    {

        int num1 = 10 ;
        int num2 = 7 ;
        int result = 0 ;


        result = num1 + num2 ;

        System.out.println ( "Το αποτέλεσμα είναι: " + result ) ;
        System.out.printf ( "Το αποτέλεσμα των %d , %d είναι %d ", num1 , num2 , result ) ;


    }

    /**
     * adds two ints
     * @param a
     *          first int
     * @param b
     *          second int
     * @return
     *          the sum of a, b
     *
     * @deprecated
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
