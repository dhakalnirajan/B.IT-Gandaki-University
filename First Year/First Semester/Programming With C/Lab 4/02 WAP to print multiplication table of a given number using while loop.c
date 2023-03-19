// Multiplication of a number by asking from the user using while loop

#include <stdio.h>
int main(){
    int i, n;
    printf("Enter a number to print its table: ");
    scanf("%d", &n);

    while (i <= 10)
    {
        printf("%d * %d = %d", n, i, n*i);
    }
    return 0;
}
