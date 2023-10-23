public class Solution
{
    public static void main(String[] args)
    {
        long soma_quadrados = 0;
        long soma = 0;
        for(int i = 1; i <= 100; i++)
        {
            soma_quadrados += i*i;
            soma += i;
        }
        System.out.println(soma*soma - soma_quadrados);
    }
}