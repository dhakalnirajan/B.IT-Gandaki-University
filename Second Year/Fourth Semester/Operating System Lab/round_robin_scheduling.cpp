#include <stdio.h>
#include <conio.h>

int main(){
	int i, j, n, bu[10], wa[10], tat[10], t, ct[10], max;
	float awt=0, att=0, temp=0;
	printf("\nEnter the number of processes:  ");
	scanf("%d", &n);
	for(i=0; i<n;i++){
		printf("Enter Burst Time for Process %d: ", i+1);
		scanf("%d", &bu[i]);
        ct[i]=bu[i];
	}

    printf("Enter the size of time slice: ");
    scanf("%d", &t);
    max=bu[0];
    for(i=1;i<n;i++){
        if(max<bu[i]){
            max=bu[i];
        }
    }

    for(j=0; j<(max/t)+1; j++){
        for(i=0; i<n; i++){
            if(bu[i]!=0){
                if(bu[i]<=t){
                    tat[i] = temp + bu[i];
                    temp = temp + bu[i];
                    bu[i] = 0;
                }
                else{
                    bu[i] = bu[i] - t;
                    temp = temp + t;
                }
            }
        }
    }

    for(i=0; i<n; i++){
        wa[i] = tat[i] - ct[i];
        att+=tat[i];
        awt+=wa[i];
    }

    printf("\n The Average Turnaround Time is: %f  \n", att);
    printf("\n The Average Waiting Time is: %f  \n", awt);
    printf("\n \t PROCESS \t BURST TIME \t WAITING TIME \t TURNAROUND TIME \n");
    for(i=0; i < n; i++){
        printf("\t\t%d\t\t%d\t\t%d\t\t%d \n", i+1, ct[i], wa[i], tat[i]);
    }

    getch();
    return 0;
}
