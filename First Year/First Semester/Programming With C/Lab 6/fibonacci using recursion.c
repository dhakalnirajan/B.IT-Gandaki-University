#include <stdio.h>

void fibonacci(int n, int a, int b) {
    if (n > 0) {
        printf("%d ", a);
        fibonacci(n-1, b, a+b);
    }
}

int main() {
    int n;
    printf("Enter the number of terms to print: ");
    scanf("%d", &n);
    printf("Fibonacci series up to %d terms: ", n);
    fibonacci(n, 0, 1);
    return 0;
}

/*
void fibonacci(int n){
    if(n == 0)
        return 0;

    else if(n == 1)
        return 1;
    
    else
        return (fibonacci(n-1) + fibonacci(n-2));
}
*/