// Input name and age of user and display it.
#include <stdio.h>
int main() {
	char name[20];
    int age;
    printf("Enter name: ");
    scanf("%s", &name);
    printf("Enter age: ");
    scanf("%d", &age);
    printf("The name of user is: %s", name);
    printf("\nThe Age of user is: %d", age);
    return 0;
}