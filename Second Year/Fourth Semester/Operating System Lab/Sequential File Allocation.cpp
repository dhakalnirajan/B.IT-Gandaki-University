#include <stdio.h>
#include <string.h>

struct fileTable {
    char name[20];
    int sb, nob;
} ft[30];

int main() {
    int i, j, n;
    char s[20];

    printf("Enter number of files: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("\nEnter file %d name: ", i + 1);
        scanf("%s", ft[i].name);
        printf("Enter starting block of file %d: ", i + 1);
        scanf("%d", &ft[i].sb);
        printf("Enter number of blocks in file %d: ", i + 1);
        scanf("%d", &ft[i].nob);
    }

    printf("\nEnter the file name to be searched: ");
    scanf("%s", s);

    for (i = 0; i < n; i++) {
        if (strcmp(s, ft[i].name) == 0) {
            break;
        }
    }

    if (i == n) {
        printf("\nFile not found\n");
    } else {
        printf("\nFile name\tStart block\tNo of blocks\tBlocks occupied\n");
        printf("%s\t\t%d\t\t%d\t\t", ft[i].name, ft[i].sb, ft[i].nob);
        for (j = 0; j < ft[i].nob; j++) {
            printf("%d ", ft[i].sb + j);
        }
        printf("\n");
    }

    return 0;
}

