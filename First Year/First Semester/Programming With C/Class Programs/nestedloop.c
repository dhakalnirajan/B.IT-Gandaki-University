#include<stdio.h>
/**
 * C program to calculate total electricity bill
 */

#include <stdio.h>

int main()
{
    int unit;
    
    float amt;
    
    printf("Enter unit");
    scanf("%d", &unit);   
    /* Calculate electricity bill according to given conditions */
    if(unit < 200)
    {
        amt = unit * 1.20;
    }
    else if(unit < 400)
    {
        amt = 199 * 1.2 + (unit-199) * 1.5;
    }
    else if(unit < 600)
    {
        amt = 199 * 1.2 + 200 * 1.5 -(unit-399)* 1.8;
    }
    else
    {
        amt = 199 * 1.2 + 200 * 1.5 + 200 * 1.8 + (unit-599)* 2;
    }

    if(amt > 400){
    	amt = amt + 0.15 * amt;
	}
	if(amt< 100){
		amt = 100;
	}
    printf("Electricity Bill = Rs. %.2f", amt);

    return 0;
}
