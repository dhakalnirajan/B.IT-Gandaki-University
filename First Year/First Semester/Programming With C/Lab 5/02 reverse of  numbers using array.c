#include<stdio.h>
int main()
{
	int n, arr[5], i;
	for (i=1;i<=5;i++){
	printf("Enter %dth number: ", i);
	scanf("%d", &arr[i]);
	}
	printf("The  reverse of five number is:   ");
	for(i=5;i>=1;i--){
		printf("%d  ",arr[i]);
	}
	return 0;
}
