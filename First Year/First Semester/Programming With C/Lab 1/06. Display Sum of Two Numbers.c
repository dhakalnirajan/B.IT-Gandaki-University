// Ask Two Numbers from User and Print Its Sum.
#include <stdio.h>
int main(){
	int num1, num2, sum;
	printf("Enter any two numbers: \n");
	scanf("%d%d", &num1, &num2);
	sum = num1 + num2;
	printf("The Sum of %d and %d is %d", num1, num2, sum);
	return 0;
}