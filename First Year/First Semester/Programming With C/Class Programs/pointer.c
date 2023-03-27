#include<stdio.h>

int main(){
	int x = 5;
	printf("Address of x is: %u\n",&x);
	printf("Value of x is: %d\n",x);
	
	int *ptr;
	ptr = &x;
	printf("The address stored by pointer variable is:%u\n", ptr);
	printf("The Value stored by pointer variable is:%d\n", ptr);
	return 0;
}
