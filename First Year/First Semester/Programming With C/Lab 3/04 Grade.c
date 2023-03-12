// WAP to accept a grade and declare the equivalent description

#include<stdio.h>
int main(){
	char a;
	printf("enter your grade:\n");
	scanf("%s",&a);
	switch (a){
		case 'e':
			printf("Excellent");
			break;
		case 'v':
			printf("Very Good");
			break;
		case 'g':
			printf("Good");
			break;
		case 'a':
			printf("Average");
			break;
		case 'f':
			printf("Fail");
			break;
		default :
			printf("Invalid Grade");
	}
	return 0;
}