package com.dsapackage.Patterns;

public class patternFive
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int i = 1; i <= n; i ++)
        {
            if(i <= n/2)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j = 1; j <= (n - i + 1); j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
