#include <iostream>

int divisores(unsigned long long num)
{   
    std::cout << num << "\n";
    int div = 1;
    unsigned long long i = 2;
    while(i <= num)
    {
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
    int num = 3;
    unsigned long long i = 3;
    while(divisores(i) <= 500)
    {
        i += num;
        num++;
    }
    std::cout << i << "\n";
    return 0;
}