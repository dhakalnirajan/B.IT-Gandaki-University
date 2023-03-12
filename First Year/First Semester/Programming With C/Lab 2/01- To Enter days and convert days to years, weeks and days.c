// WAP to enter days and convert days to years, weeks and days. (Hint: years = days / 365, weeks = (days % 365) / 7, days = days - ((years * 365) + (weeks * 7))
#include <stdio.h>

int main () {
    int days, weeks, years;

    printf("Enter the number of days:");
    scanf("%d", &days);
    years = days / 365;      // converting days into years:
    weeks = (days % 365) / 7;      // converting days weeks:
    days = days - ((years * 365) + (weeks * 7));          // converting days into remaining days:
    printf("The total number of years, weeks and days are %d, %d and %d respectively.", years, weeks, days);
    return 0;
}



