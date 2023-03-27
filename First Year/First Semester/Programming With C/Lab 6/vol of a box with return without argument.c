#include <stdio.h>

double volume() {
    double l, b, h;

    printf("Enter the length, breadth and height of the box: ");
    scanf("%lf %lf %lf", &l, &b, &h);

    double vol = l * b * h;

    return vol;
}

int main() {
    double vol = volume();

    printf("The volume of the box is: %.2lf\n", vol);

    return 0;
}
