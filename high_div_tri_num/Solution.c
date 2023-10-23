#include <stdio.h>

int divisores(unsigned long long num)
{   
    unsigned long long i = 2;
    printf("%llu", num);
    int div = 1;
    while(i < num){
        if(num % i == 0) 
        {
            num /= i;
            div++;
        }
        else i++;
    }

    return div;
}

int main()
{
    unsigned long long i = 3;
    int num = 3;
    while(divisores(i) <= 500)
    {
        printf("%llu + %d", i, num);
        i += num;
        num++;
    }
    printf("%llu", i);
    return 0;
}