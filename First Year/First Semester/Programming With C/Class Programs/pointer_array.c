#include<stdio.h>

int main(){
	int a[]={10,11,22,33,44};
	int (*p)[5];
	p = &a;
	printf("%u",p);
	return 0;
}
