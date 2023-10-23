import java.util.Scanner;

/*
 * Matheus Rodrigues da Silva Espalar
 * 
 * ideia:
 *      Fazer como se fosse uma busca linear, melhor maneira nesse caso, já que não podemos ordenar.
 */
public class Solution
{

    public static void main(String[] args)
    {
        Scanner myScan = new Scanner(System.in);
        String adjacentes = myScan.nextLine();

        long mult = 1, maior = 0;
        int i = 0;
        while(i + 13 < adjacentes.length())
        {
            mult *= Character.getNumericValue(adjacentes.charAt(i));
            for(int j = i + 1; j < i + 13; j++)
            {
                mult *= Character.getNumericValue(adjacentes.charAt(j));
            }
            if(mult > maior)
            {
                maior = mult;
            }
            mult = 1;
            i++;
        }
        System.out.println(maior);
        myScan.close();
    }
}