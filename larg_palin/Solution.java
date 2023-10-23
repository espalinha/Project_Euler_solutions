/*
 * Matheus Rodrigues da Silva Espalaor
 */

public class Solution 
{
    public static boolean ePalin(long num)
    {
        int i = 0;
        String num_str = Long.toString(num);
        if(num_str.length() % 2 != 0) return false;
        else
        {
            for(int j = num_str.length() - 1; j >= num_str.length()/2; j--)
            {
                if(num_str.charAt(j) != num_str.charAt(i)) return false;
                i++;
            }
            return true;
        }  
    }
    public static void main(String[] args)
    {
        long max_palin = 0;
        for(int i = 100; i < 1000; i++)
        {
            for(int j = 100; j < 1000; j++)
            {
                long num = i * j;
                if(ePalin(num) == true && num > max_palin) max_palin = num;
            }
        }
        System.out.println(max_palin);
    }
}
