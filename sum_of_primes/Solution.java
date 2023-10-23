import java.util.ArrayList;

/*
 * Matheus Rodrigues da Silva Espalaor
 * Ideia:
 *       Fazer um brute force otimizado.
 *       Para isso, já coloquei dois como primo, e na soma, para assim, só trabalharmos com numeros ímpares, diminuindo na metade a quantidade de numeros que teremos que passar.
 *       Para auxiliar na checagem, usamos a memoização, pois, nós fariamos repetidas vezes a checagem, usando primos que ja conhecos.
 *       Como ja sabemos, todo numero nao primo é divisivel por um primo, assim, diminuimos a quantidade de loops.
 */

public class Solution
{
    public static ArrayList<Integer> primos = new ArrayList<Integer>();

    public static boolean checaPrimo(int num)
    {
        for(int i = 0; i < primos.size(); i++)
        {
            if(num % primos.get(i) == 0) return false;
        }
        primos.add(num);
        return true;
    }
    
    public static void main(String[] args)
    {
        primos.add(2);
        long soma = 2; //Já coloquei o dois aqui 
        for(int i = 3; i < 2000000; i += 2)
        {
            if(checaPrimo(i) == true) soma += i;
        }
        System.out.println(soma);
    }
}