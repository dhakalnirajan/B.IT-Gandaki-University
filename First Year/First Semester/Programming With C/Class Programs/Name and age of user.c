#include <stdio.h>
int main(){
	int a;
	char name [40];
	printf("Enter name and age: ");
	scanf("%s%d", &name, &a);
	printf("The name and age of user is: %s and %d", name, a);
	return 0;
}
