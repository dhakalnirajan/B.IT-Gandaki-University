#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct block {
    int bno;
    struct block *next;
};

struct fileTable {
    char name[20];
    int nob;
    struct block *sb;
} ft[30];

int main() {
    int n, i, j;
    char s[20];
    struct block *temp;
    printf("Enter the number of files: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("\nEnter the file name %d: ", i + 1);
        scanf("%s", ft[i].name);
        printf("\nEnter the number of blocks for file %d: ", i + 1);
        scanf("%d", &ft[i].nob);
        ft[i].sb = NULL;
        for (j = 0; j < ft[i].nob; j++) {
            temp = (struct block *)malloc(sizeof(struct block));
            printf("\nEnter the block number %d for file %d: ", j + 1, i + 1);
            scanf("%d", &temp->bno);
            temp->next = ft[i].sb;
            ft[i].sb = temp;
        }
    }

    printf("\nEnter the file name to be searched: ");
    scanf("%s", s);

    for (i = 0; i < n; i++) {
        if (strcmp(s, ft[i].name) == 0) {
            printf("\nFILE NAME\tNUMBER OF BLOCKS\tBLOCKS OCCUPIED");
            printf("\n%s\t\t\t%d\t\t", ft[i].name, ft[i].nob);
            
            temp = ft[i].sb;
            while (temp != NULL) {
                printf("%d ", temp->bno);
                temp = temp->next;
            }
            break;
        }
    }

    if (i == n) {
        printf("\nFile not found.");
    }

    return 0;
}
