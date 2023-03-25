#include <stdio.h>

int main()
{
    int arr1[10], i, j, tmp;

    printf("Enter 10 elements in the array:\n");
    for(i=0;i<10;i++)
    {
        printf("Enter element %d: ", i+1);
        scanf("%d",&arr1[i]);
    }

    for(i=0; i<10; i++)
    {
        for(j=i+1; j<10; j++)
        {
            if(arr1[j] < arr1[i])
            {
                tmp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = tmp;
            }
        }
    }

    printf("\nElements of array in sorted ascending order:\n");
    for(i=0; i<10; i++)
    {
        printf("%d ", arr1[i]);
    }

    return 0;
}


// To Dynamically ask user the size of array and print the numbers in Ascending order, following is the program. To execute the program, uncomment the code:

/*
#include <stdio.h>

int main()
{
    int n, i, j, tmp;
    printf("Input the size of array : ");
    scanf("%d", &n);
    int arr1[n];
    printf("Input %d elements in the array :\n", n);

    // Taking input from user
    for(i = 0; i < n; i++)
    {
        printf("Element - %d : ", i);
        scanf("%d", &arr1[i]);
    }

    // Sorting array elements in ascending order
    for(i = 0; i < n; i++)
    {
        for(j = i+1; j < n; j++)
        {
            if(arr1[j] < arr1[i])
            {
                tmp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = tmp;
            }
        }
    }

    // Printing the sorted array
    printf("\nElements of array in sorted ascending order:\n");
    for(i = 0; i < n; i++)
    {
        printf("%d  ", arr1[i]);
    }

    return 0;
}
*/
