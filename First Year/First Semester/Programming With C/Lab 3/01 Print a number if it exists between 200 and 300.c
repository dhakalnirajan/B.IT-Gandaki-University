#include <stdio.h>

int main(){
    int n;
    printf("Enter a number: \n");
    scanf("%d", &n);

    if(n > 200 && n < 300){
        printf("%d", n);
    }
    else{
        printf("Enter valid number between 200 and 300.");
    }
    return 0;
}