#include <stdio.h>

/*
    Matheus Rodrigues da Silva Espalaor

    Ideia: 
    A ideia desse codigo é encontrar todos os divisores e, sempre que encontra, divide pelo divisor, assim, acabamos ficando com velores cada vez menores. Então, no final, ficaremos com o ultimo primo, pois 6857/6857
*/

int main()
{
    unsigned long long i = 2;
    unsigned long long numero = 600851475143;
    while (i < numero)
    {
        if(numero % i == 0) numero /= i;
        else i++;
    }
    printf("%llu\n", i);
    return 0;
}