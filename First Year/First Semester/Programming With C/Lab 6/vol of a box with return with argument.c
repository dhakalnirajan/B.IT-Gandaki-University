#include <stdio.h>

double volume(double l, double b, double h) {
    double vol = l * b * h;
    return vol;
}

int main() {
    double l, b, h, vol;

    printf("Enter the length, breadth and height of the box: ");
    scanf("%lf %lf %lf", &l, &b, &h);

    vol = volume(l, b, h);

    printf("The volume of the box is: %.2lf\n", vol);

    return 0;
}
