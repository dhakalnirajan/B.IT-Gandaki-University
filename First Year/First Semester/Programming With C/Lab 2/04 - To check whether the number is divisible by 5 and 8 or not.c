// WAP to check whether the number is divisible by 5 and 8 or not.

#include <stdio.h>

int main() {
    int a;
    printf("Enter a number: \n");
    scanf("%d", &a);
    if (a%5==0 && a%8==0)
    {
        printf("The number is divisible by 5 and 8 both.");
    }
    else
    {
        printf("The numbe is not divisible by 5 and 8.");
    }
    return 0;
}