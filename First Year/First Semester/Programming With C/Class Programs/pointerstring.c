#include<stdio.h>

int main(){
	int a[] = {1,2,3,4,5};
	int *p,*q ;
	p = a;
	q = a+2;
	printf("P:%d\n",p);
	printf("Q:%d\n",q);
	printf("Q-P:%d\n",q-p);
	return 0;
}
