package gr.aueb.cf.ch2;

public class TypecastApp
{
    public static void main(String[] args)
    {
        int num1 = 10;
        long num2 = 20L;
        long result = 0;


        num1 = (int) num2 ;                 //Typecast.

        result = num1 + num2;
        result = (long) num1 + num2;        //Same as above.


    }
}
