// Sum of n natural numbers Using while loop

#include <stdio.h>
int main(){
    int i=1, n, sum = 0;
    printf("Enter a number to calculate sum of numbers upto that number: ");
    scanf("%d", &n);

    while (i <= n)
    {
        sum = sum + i;
        i++;
    }
    printf("The sum using while loop is: %d. \n", sum);
    return 0;
}
