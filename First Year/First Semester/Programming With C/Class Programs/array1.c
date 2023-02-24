#include<stdio.h>

int main(){
	int n,i;
	printf("Enter how many integers:\n");
	scanf("%d",&n);
	int arr[n];
	for(i=0;i<n;i++){
		printf("Enter %d num", i+1);
		scanf("%d",&arr[i]);
	}
	for(i=n-1;i>=0;i--){
		printf("\n%d",arr[i]);
	}
	return 0;
}
