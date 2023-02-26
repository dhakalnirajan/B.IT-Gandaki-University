#include <stdio.h>

int main() {
    float units, bill;

    printf("Enter the number of units consumed: ");
    scanf("%f", &units);

    if (units <= 50) {
        bill = units * 0.5;
    }
    else if (units <= 150) {
        bill = 25 + ((units - 50) * 0.75);
    }
    else if (units <= 250) {
        bill = 100 + ((units - 150) * 1.20);
    }
    else {
        bill = 220 + ((units - 250) * 1.50);
    }

    // add surcharge
    bill += bill * 0.2;

    printf("Total electricity bill: Rs. %.2f\n", bill);

    return 0;
}
