#include <stdio.h>
int main(){
    int i, arr[10], max, min;
    printf("Enter 10 numbers: \n");
    printf("\n");
    printf("---------------------------------------------");
    printf("\n");
    printf("\n");
    
    // asking numbers from the user:
    for(i = 1; i <= 10; i++){
        printf("Enter %dth element: ", i);
        scanf("%d", &arr[i]);
    }
    
    // checking the largest number among 10 numbers:
    for(i = 1; i <= 10; i++){
        if (arr[i] > arr[i+1])
        {
            max = arr[i];
        }
        else{
            min = arr[i];
        }
    }
    printf("The maximum number is: %d. \n", max);
	printf("The minimum number is: %d. \n", min);
}
