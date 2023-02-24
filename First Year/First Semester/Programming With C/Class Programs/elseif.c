//WAP to ask user a number and print its corresponding day

#include<stdio.h>

int main(){
	int a;
	printf("Enter a number\n");
	scanf("%d", &a);
	switch(a){
		case 1:
			printf("Sunday");
			break;
		case 2:
			printf("monday");
			break;
		case 3:
			printf("Tuesday");
			break;
		case 4:
			printf("Wednesday");
			break;
		case 5:
			printf("thursday");
			break;
		case 6:
			printf("Friday");
			break;
		case 7:
			printf("Saturday");
			break;
		default:
			printf("Please enter valid number");
	}
	return 0;
}
