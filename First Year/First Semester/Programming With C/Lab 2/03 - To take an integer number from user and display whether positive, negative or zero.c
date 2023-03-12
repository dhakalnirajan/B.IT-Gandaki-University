// WAP to take an integer from user and display whether the number is positive, negative or zero.
#include <stdio.h>
int main() {
    int a, remark;
    printf("Enter a number: \n");
    scanf("%d", &a);
    if (a>0)
    {
        printf("The number is positive.");
    }
    else if (a<0)
    {
        printf("The number is negative.");
    }
    else{
        printf("The number is zero.");
    }
    return 0;
}