#include<stdio.h>

intchecknum(int x);
int main(){
	int n;
	printf("Enter a number:");
	scanf("%d", &n);
	int e= checknum(n);
	if(e==0){
		printf("\nIt is even");
	}
	else{
		printf("\nIt is odd");
	}
}

int checknum(int d){
	int i;
	i = d%2;
	return i;
	
}
