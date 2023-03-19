// Multiplication Table of n number from user using do.. while loop.

#include<stdio.h>
int main(){
	int n,i;
	printf("enter a number\n");
	scanf("%d",&n);

  i=1;
	do{
		printf("%d * %d =  %d\n",n,i,n*i);
		i++;
	}
	while(i<=10);
	return 0;
}
