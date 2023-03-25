// Matrix Multiplication of any given matrix

#include <stdio.h>

int main()
{
    int a[10][10], b[10][10], product[10][10];  // matrices to be multiplied and resultant matrix
    int m, n, p, q, i, j, k;  // loop variables and matrix dimensions

    printf("Enter the number of rows and columns of first matrix: ");
    scanf("%d %d", &m, &n);

    printf("Enter the elements of first matrix:\n");
    for(i=0; i<m; i++)  // loop through rows of first matrix
    {
        for(j=0; j<n; j++)  // loop through columns of first matrix
        {
            scanf("%d", &a[i][j]);  // read element at position i,j from user
        }
    }

    printf("Enter the number of rows and columns of second matrix: ");
    scanf("%d %d", &p, &q);

    if(n != p)  // check if matrices can be multiplied
    {
        printf("Matrices cannot be multiplied!\n");
        return 0;
    }

    printf("Enter the elements of second matrix:\n");
    for(i=0; i<p; i++)  // loop through rows of second matrix
    {
        for(j=0; j<q; j++)  // loop through columns of second matrix
        {
            scanf("%d", &b[i][j]);  // read element at position i,j from user
        }
    }

    // perform matrix multiplication and store the result in matrix product
    for(i=0; i<m; i++)  // loop through rows of first matrix
    {
        for(j=0; j<q; j++)  // loop through columns of second matrix
        {
            product[i][j] = 0;  // initialize element at position i,j to zero

            for(k=0; k<n; k++)  // loop through columns of first matrix and rows of second matrix
            {
                product[i][j] += a[i][k] * b[k][j];  // multiply corresponding elements and accumulate the result
            }
        }
    }

    // print the resultant matrix product
    printf("The product of the two matrices is:\n");
    for(i=0; i<m; i++)  // loop through rows
    {
        for(j=0; j<q; j++)  // loop through columns
        {
            printf("%d ", product[i][j]);  // print element at position i,j
        }
        printf("\n");  // move to next row
    }
    return 0;
}
