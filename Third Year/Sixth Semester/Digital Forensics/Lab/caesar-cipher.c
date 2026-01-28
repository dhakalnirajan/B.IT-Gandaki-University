#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    int i, x;
    char str[100];
    int key = 3;

begin:
    printf("\nPlease choose following options:\n");
    printf("1 = Encrypt the string.\n");
    printf("2 = Decrypt the string.\n");
    printf("3 = Exit\n");
    scanf("%d", &x);

    switch (x) {
        case 1:
            printf("Enter a message\n");
            gets(str);
            for (i = 0; i < 100 && str[i] != '\0'; i++) {
                str[i] = str[i] + key; //the key for encryption is added to ASCII value
            }
            printf("\nEncrypted string: %s\n", str);
            goto begin;

        case 2:
            printf("Enter a message\n");
            gets(str);
            for (i = 0; i < 100 && str[i] != '\0'; i++) {
                str[i] = str[i] - key; //the key for encryption is subtracted to ASCII value
            }
            printf("\nDecrypted string: %s\n", str);
            goto begin;

        case 3:
            exit(0);

        default:
            printf("\nError\n");
            return 0;
    }
}
