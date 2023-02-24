#include<stdio.h>

int main(){
	int n,fact=1,i;
	printf("Enter a number:\n");
	scanf("%d", &n);
	
	for(i = 1;i<=n;i++){
		fact = fact * i;
	}
	printf("Factorial is:%d",fact);	
	return 0;
}
