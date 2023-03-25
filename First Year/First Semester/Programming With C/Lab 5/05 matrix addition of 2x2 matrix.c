// Matrix addition of 2x2 matrix

#include<stdio.h>

int main()
{
    int i, j;  // loop variables
    int a[2][2], b[2][2], c[2][2];  // matrices to be added

    printf("Enter the elements of first matrix:\n");
    for(i=0; i<2; i++)  // loop through rows of first matrix
    {
        for(j=0; j<2; j++)  // loop through columns of first matrix
        {
            scanf("%d", &a[i][j]);  // read element at position i,j from user
        }
    }

    printf("Enter the elements of second matrix:\n");
    for(i=0; i<2; i++)  // loop through rows of second matrix
    {
        for(j=0; j<2; j++)  // loop through columns of second matrix
        {
            scanf("%d", &b[i][j]);  // read element at position i,j from user
        }
    }

    // add the two matrices element-wise and store the result in matrix c
    for(i=0; i<2; i++)  // loop through rows
    {
        for(j=0; j<2; j++)  // loop through columns
        {
            c[i][j] = a[i][j] + b[i][j];  // add corresponding elements
        }
    }

    // print the resultant matrix c
    printf("The sum of the two matrices is:\n");
    for(i=0; i<2; i++)  // loop through rows
    {
        for(j=0; j<2; j++)  // loop through columns
        {
            printf("%d ", c[i][j]);  // print element at position i,j
        }
        printf("\n");  // move to next row
    }
    return 0;
}
