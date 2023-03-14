// WAP to print sum of n natural number using do... while loop
#include <stdio.h>
int main(){
    int i, sum = 0, n;
    printf("Enter a number: ");
    scanf("%d", &n);
    do{
        sum = sum + i;
        i++;
    } while (i <= n);
    printf("The sum using do.. while loop is: %d. \n", sum);
    return 0;
}
