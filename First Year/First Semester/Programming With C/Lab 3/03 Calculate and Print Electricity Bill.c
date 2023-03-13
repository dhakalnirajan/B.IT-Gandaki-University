// WAP to calculate and print the electricity bill of a given customer.

#include <stdio.h>

int main() {
    int customer_id, unit;
    char name[50];

    float charge_per_unit, total_charge, surcharge = 0, net_amount;

    printf("Enter customer id: ");
    scanf("%d", &customer_id);

    printf("Enter customer name: ");
    scanf("%s", name);

    printf("Enter the number of units consumed: ");
    scanf("%d", &unit);

    if (unit <= 199) {
        charge_per_unit = 1.20;
    }
    else if (unit >= 200 && unit < 400) {
        charge_per_unit = 1.50;
    }
    else if (unit >= 400 && unit < 600) {
        charge_per_unit = 1.80;
    }
    else {
        charge_per_unit = 2.0;
    }

    total_charge = unit * charge_per_unit;

    if (total_charge > 400) {
        surcharge = total_charge * 0.15;
    }

    net_amount = total_charge + surcharge;

    if (net_amount < 100) {
        net_amount = 100;
    }

    printf("\nCustomer ID: %d", customer_id);
    printf("\nCustomer Name: %s", name);
    printf("\nNumber of units consumed: %d", unit);
    printf("\nNet Amount Paid By the Customer: Rs. %.2f", net_amount);

    return 0;
}
