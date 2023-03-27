#include <stdio.h>

void volume(double l, double b, double h) {
    double vol = l * b * h;

    printf("The volume of the box is: %.2lf\n", vol);
}

int main() {
    double l, b, h;

    printf("Enter the length, breadth and height of the box: ");
    scanf("%lf %lf %lf", &l, &b, &h);

    volume(l, b, h);

    return 0;
}
