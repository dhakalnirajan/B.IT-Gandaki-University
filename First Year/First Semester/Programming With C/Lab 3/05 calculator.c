// WAP to create a calculator that performs simple calculation
#include<stdio.h>
int main(){
	int a,b;char c;
	printf("enter a:");
	scanf("%d",&a);
	printf("Enter (+,-,/,*,%)\nenter sign:");
	scanf("%s",&c);
	printf("enter b:");
	scanf("%d",&b);
	switch (c){
		case '+':
			a+=b;
			break;
		case '-':
			a-=b;
			break;
		case '*':
			a*=b;
			break;
		case '/':
			a/=b;
			break;
		case '%':
			a%=b;
			break;		
		default:
			printf("invalid sign");
	}
	printf("result = %d",a);
	return 0;
}
