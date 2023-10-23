/*
 * Matheus Rodrigues da Silva Espalaor
 * Ideia: 
 *      Para resolver esse problema, pensei em usar o brute force, enquanto a lista de valores inteira nao divide o i, que é o mmc, nós continuamos a somar.
 */


public class Solution
{
    public static boolean verificador(long[] array, long numero)
    {
        for(int j = 1; j <= 20; j++)
        {
                if(numero % j != 0) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        boolean verificador = false;
        long i = 2;
        long[] numeros = new long[21];
        for(int j = 1; j <= 20; j++)
        {
            numeros[j - 1] = j; 
        }

        while(!verificador(numeros, i))
        {
            i++;
        }
        System.out.println(i);
    }
}