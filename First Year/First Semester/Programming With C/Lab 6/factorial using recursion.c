// WAP to find factorial of any number using recursion.

#include <stdio.h>

int factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

int main() {
    int num, result;
    
    printf("Enter a non-negative integer: ");
    scanf("%d", &num);
    
    if (num < 0) {
        printf("Error: factorial of negative number is undefined.\n");
    } else {
        result = factorial(num);
        printf("Factorial of %d is %d\n", num, result);
    }
    
    return 0;
}
