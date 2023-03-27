#include<stdio.h>

int main(){
	int a=5;
	int *b;
	int **c;
	
	b = &a;
	c = &b;
	
	printf("Without pointer %d\n", a);
	printf("With Single pointer %u\n", *b);
	printf("With double pointer %u\n", **c);
	
	return 0;
}
