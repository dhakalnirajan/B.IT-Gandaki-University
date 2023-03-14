//WAP to ask user an element of 2*3 matrix and find the sum of 
//only odd elements 

#include<stdio.h>

int main(){
	int m[1][1], i, j, sum=0;
	for(i=0;i<=1;i++){
		for(j=0;j<=2;j++){
			scanf("%d",&m[i][j]);
			if(m[i][j]%2==1){
				sum = sum + m[i][j];
			}
		}
	}
	
	printf("the sum is %d", sum);
	return 0;
}
