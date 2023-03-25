//Matrix Transpose

#include <stdio.h>

int main()
{
    int m, n, i, j;

    // Input the size of matrix
    printf("Enter the number of rows and columns of matrix: ");
    scanf("%d%d", &m, &n);

    int matrix[m][n], transpose[n][m];

    // Input matrix elements
    printf("\nEnter the elements of matrix:\n");
    for(i=0; i<m; i++)
    {
        for(j=0; j<n; j++)
        {
            printf("Enter element matrix[%d][%d]: ", i, j);
            scanf("%d", &matrix[i][j]);
        }
    }

    // Display original matrix
    printf("\nOriginal matrix:\n");
    for(i=0; i<m; i++)
    {
        for(j=0; j<n; j++)
        {
            printf("%d\t", matrix[i][j]);
        }
        printf("\n");
    }

    // Transpose matrix
    for(i=0; i<n; i++)
    {
        for(j=0; j<m; j++)
        {
            transpose[i][j] = matrix[j][i];
        }
    }

    // Display transpose matrix
    printf("\nTranspose matrix:\n");
    for(i=0; i<n; i++)
    {
        for(j=0; j<m; j++)
        {
            printf("%d\t", transpose[i][j]);
        }
        printf("\n");
    }

    return 0;
}
