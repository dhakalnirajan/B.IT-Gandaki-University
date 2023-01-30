// Ask Two Decimal Numbers from User and Print Its Product.
#include <stdio.h>
int main(){
	float num1, num2, prod;
	printf("Enter any two numbers: \n");
	scanf("%f%f", &num1, &num2);
	prod = num1 * num2;
	printf("The Product of %f and %f is %f", num1, num2, prod);
	return 0;
}