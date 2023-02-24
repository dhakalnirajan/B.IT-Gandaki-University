#include<stdio.h>

int main(){
	int a;
	printf("Enter a number;\n");
	scanf("%d", &a);
	(a%2==0)?(a=a/2):(a = 3*a+1);
	printf("%d", a);
	return 0;
}
