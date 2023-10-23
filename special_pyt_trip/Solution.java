/*
 * Matheus Rodrigues da Silva Espalaor
 * Ideia:
 *      A maneira mais simples de se abordar esse problema é usando o brute force
 */

public class Solution
{

    public static void main(String[] args)
    {
        for(int a = 1; a < 1000; a++)
        {
            for(int b = 1; b < 1000; b++)
            {
                for(int c = 1; c < 1000; c++)
                {
                    if(c*c == a*a + b*b && a + b + c == 1000) System.out.println(a*b*c);
                }
            }
        }
    }
}