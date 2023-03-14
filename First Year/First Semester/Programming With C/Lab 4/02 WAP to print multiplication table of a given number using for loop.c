// 02 WAP to print multiplication table of a given number using for loop
#include <stdio.h>
int main(){
    int i, n;
    printf("Enter a number to print its table: ");
    scanf("%d", &n);

    for(i = 1; i <= 10; i++){
        printf("%d * %d = %d \n", n, i, n*i);
    }
    return 0;
}