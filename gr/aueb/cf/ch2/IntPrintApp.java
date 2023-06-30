package gr.aueb.cf.ch2;

public class IntPrintApp
{
    public static void main(String[] args)
    {
        int i = 12;


        System.out.print(i);
        System.out.println(i);
        System.out.printf("%d" , i);

        System.out.print("i = " + i);
        System.out.println("i = " + i);
        System.out.printf("i = %d \n" , i);

        System.out.printf("%d \n" , i );
        System.out.printf("%4d \n" , i );
        System.out.printf("%04d \n" , i );
        System.out.printf("%,04d \n" , i );


    }
}
