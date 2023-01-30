// Input name and age of user and display it.
#include <stdio.h>
int main() {
	char name[20];
    int age;
    printf("Enter name: \n");
    scanf("%s", &name);
    printf("Enter age: ");
    scanf("%d", &age);
    printf("Name is: %s", name);
    printf("\nAge is: %d", age);
    return 0;
}
