#include<stdio.h>

int main(){
	int A[2][2],B[2][1],C[2][1],i,j,k;
	printf("Enter elements of matrix A:\n");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			scanf("%d",&A[i][j]);
		}
	}
	printf("Enter elements of matrix B:\n");
	for(i=0;i<2;i++){
		for(j=0;j<1;j++){
			scanf("%d",&B[i][j]);
		}
	}
	for(i=0;i<2;i++){
		for(j=0;j<1;j++){
			C[i][j]=0;
			for(k=0;k<2;k++){
				C[i][j]= C[i][j]+A[i][k]*B[k][j];
			}
		}
	}
	printf("Product is:\n");
	for(i=0;i<2;i++){
		for(j=0;j<1;j++){
			printf("%d\t",C[i][j]);
			}
		printf("\n");
		}
		
	return 0;
}
