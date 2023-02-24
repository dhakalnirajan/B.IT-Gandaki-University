#include<stdio.h>
int main(){
	float n[4]={3.0,4.2,3.3,2.2},sm=0.0;
	int i;
	for(i=0;i<=4;i++){
		sm = sm + n[i];
	}
	printf("Sum:%f", sm);
	return 0;
}

