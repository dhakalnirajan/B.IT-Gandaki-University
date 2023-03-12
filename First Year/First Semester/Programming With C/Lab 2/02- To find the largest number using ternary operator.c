// WAP TO  find the largest number using ternary operators.

#include <stdio.h>

int main(){
    int a, b, c, max_number;
    printf("Enter three numbers: \n");
    scanf("%d%d%d", &a, &b, &c);
    max_number = a>b ? (a>c ? a:c) : (b>c ? b:c);
    printf("The largest number is %d.", max_number);
    return 0;
}