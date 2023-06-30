package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * υπολογιζει το a^n με bigint
 */
public class BigIntPowerApp
{
    public static void main(String[] args)
    {
        BigInteger a;
        BigInteger n;
        BigInteger result = new BigInteger("1");
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert base, power");
        a = in.nextBigInteger();
        n = in.nextBigInteger();

        for (int i = 1; i <= n.intValue(); i++)
            //για να συγκρινω i με n πρεπει να ειναι και τα δυο int
        {
            result = result.multiply(a);

        }

        System.out.printf("%d^%d = %,d", a, n, result);


    }
}
