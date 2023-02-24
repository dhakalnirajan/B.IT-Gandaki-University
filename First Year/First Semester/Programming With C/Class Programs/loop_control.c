#include <stdio.h>

int main(){
	int n,i,count=0;
	printf("Enter a number:\n");
	scanf("%d", &n);
	for(i=2;i<=n-1;i++){
		if(n%i==0){
			count = count +1;
		}
	}
	if(count==0){
		printf("prime");
	}
	else{
		printf("composite");
	}
	return 0;
}
