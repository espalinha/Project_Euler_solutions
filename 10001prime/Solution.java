public class Solution
{
    public static boolean checa_prim(long num)
    {
        long i = 2;
        while(i < num)
        {
            //System.out.println(i);
            if(num % i == 0) 
            {
                return false;
            }
            i++;
        }
        //System.out.println("é primo");
        return true;
    }
    
    public static void main(String[] args)
    {
        long primo = 1;
        long loc = 0;
        while(loc < 10001)
        {
            primo++;
            if(checa_prim(primo) == true)
            {
                loc++;
            }
            //System.out.println(loc);
        }

        System.out.println(primo);
    }
}