// Sum of n natural number using for loop
#include <stdio.h>
int main(){
    int i, n, sum=0;
    printf("Enter a number to calculate sum of numbers upto that number: ");
    scanf("%d", &n);
    for(i = 1; i <= n; i++){
    sum = sum + i;
    }
    printf("The sum using for loop is: %d. \n", sum);
    return 0;
}