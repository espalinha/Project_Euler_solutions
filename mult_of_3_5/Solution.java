/*
 * Matheus Rodrigues da Silva Espalaor
 */

public class Solution
{
    public static void main(String[] args)
    {
        long soma = 0;
        for(int i = 3; i < 1000; i++)
        {
            if(i % 3 == 0 || i % 5 == 0) soma += i;
        }
        System.out.println(soma);
    }
}