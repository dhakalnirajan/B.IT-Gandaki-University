// 1 2 4 5 7 8 10
#include<stdio.h>
int main(){
	int i;
	for(i = 1; i <= 10; i++){
		if(i % 3 == 0){
			continue;
		}
		else{
			printf("%d \t", i);
		}
	}
	return 0;
}
