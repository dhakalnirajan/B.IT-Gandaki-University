// Multiplication of a number by asking from the user using while loop

#include <stdio.h>
int main(){
    int i, n;
    printf("Enter a number to print its multiplication table: ");
    scanf("%d", &n);

    while (i <= 10)
    {
        printf("%d * %d = %d\n", n, i, n*i);
        i = i+1;
    }
    return 0;
}
