// Ask user to input name of user and print the age.
#include <stdio.h>
int main() {
	char name[30];
	printf("Please input your name: \n");
	scanf("%s", &name);
	printf("The name is: %s", name);
	return 0;
}
