// WAP to calculate and print the electricity bill of a given customer.

#include<stdio.h>
int main(){
	float unit,cost;
	int cid;
	char name[50];
	printf("Enter customer id: ");
	scanf("%d",&cid);
	printf("Enter name:");
	scanf("%s",&name);
	printf("Enter unit: ");
	scanf("%f",&unit);
	if(unit <= 199){
		cost=unit*1.20;
    }
	else if(unit == 200 && unit <400){
        cost=unit*1.50;
        printf("%f", cost);
    }
	else if(unit == 400 && unit <600){
        cost=unit*1.80;
        printf("%f", cost);
    }	
	else if(unit >= 600){
        cost=unit*2.0;
        printf("%f", cost);
    }
	else{
		cost=100;
        printf("%f", cost);
    }
	if(cost > 400){
		cost = cost + ((15/100)*cost);
        printf("%f", cost);
	}
    else if(cost < 100){
		cost=100;
	    printf("Dear %s you need to pay %f",name,cost);
    }
    return 0;
}
