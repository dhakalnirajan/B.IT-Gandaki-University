//  To ask any five numbers and print their sum using array.

#include <stdio.h>
int main(){
	int n, arr[5], i, sum = 0;
	for(i = 1; i <= 5; i++){
		printf("Enter %dth number: ",i);
		scanf("%d", &arr[i]);
		sum = sum + arr[i];
	}
	printf("The sum of those five numbers is: %d", sum);
	return 0;
}
