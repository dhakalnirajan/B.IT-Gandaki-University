#include<stdio.h>
#include<conio.h>
#include<string.h>

struct fileTable {
    char name[20];
    int sb, nob;
} ft[30];

int main() {
    int i, j, n, totalBlocks = 0;
    char s[20];
    printf("Enter no of files: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("\nEnter the file name %d: ", i + 1);
        scanf("%s", ft[i].name);
        printf("\nEnter the starting block of file %d: ", i + 1);
        scanf("%d", &ft[i].sb);
        printf("\nEnter the no of blocks %d: ", i + 1);
        scanf("%d", &ft[i].nob);
        totalBlocks += ft[i].nob;
    }

    printf("\nEnter the file name to be searched: ");
    scanf("%s", s);

    for (i = 0; i < n; i++) {
        if (strcmp(s, ft[i].name) == 0) {
            printf("\nFILE NAME\tSTART BLOCK\tNUMBER OF BLOCKS\tBLOCKS OCCUPIED");
            printf("\n%s\t\t%d\t\t%d\t\t%d", ft[i].name, ft[i].sb, ft[i].nob, totalBlocks);
            break;
        }
    }

    if (i == n) {
        printf("\nFile not found.");
    }

    getch();
    return 0;
}
