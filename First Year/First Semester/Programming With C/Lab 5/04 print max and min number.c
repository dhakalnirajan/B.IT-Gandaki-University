#include <stdio.h>
int main(){
    int i, j, arr[10], max, min;
    printf("Enter 10 numbers: \n");
    printf("\n");
    printf("---------------------------------------------");
    printf("\n");
    printf("\n");
    
    // asking numbers from the user:
    for(i = 0; i < 10; i++){
        printf("Enter %dth element: ", i);
        scanf("%d", &arr[i]);
    }
    
    // checking the largest number among 10 numbers:
    max = arr[0];
    min = arr[0];
    for(i = 0; i < 10; i++){
        if (arr[i] > max)
        {
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }
    }
    printf("The maximum number is: %d. \n", max);
	printf("The minimum number is: %d. \n", min);
}
