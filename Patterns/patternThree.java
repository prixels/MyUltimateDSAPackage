package com.dsapackage.Patterns;

public class patternThree
{
    public static void main(String[] args)
    {
        /*
        for(int i = 5; i >= 1; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 4 - i + 1; j++) // loop running for (n - i + 1) times.
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
