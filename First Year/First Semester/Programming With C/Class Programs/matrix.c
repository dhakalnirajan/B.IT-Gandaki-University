#include<stdio.h>

int main(){
	int n;
	printf("Enter the size of matrix (n)");
	scanf("%d",&n);
	int A[n][n],B[n][n],C[n][n],i,j;
	printf("Enter elements of matrix A:\n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			scanf("%d",&A[i][j]);
		}
	}
	printf("Enter elements of matrix B:\n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			scanf("%d",&B[i][j]);
		}
	}
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			C[i][j]=A[i][j]+B[i][j];
		}
	}
	printf("Sum is:\n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			printf("%d\t",C[i][j]);
		}
		printf("\n");
	}
	return 0;
}
