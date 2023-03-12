#include <stdio.h>

int main() {
    int a, cube;
    printf("Enter a number: ");
    scanf("%d", &a);
    printf("\n");
    cube = a*a*a;
    printf("The cube of %d is %d.", a, cube);
    return 0;
}