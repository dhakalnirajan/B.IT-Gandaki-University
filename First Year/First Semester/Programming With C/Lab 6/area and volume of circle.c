// WAP that contains findarea() and findvolume() function to find area and volume of a circle of radius r, define PI = 3.14 as MACRO.

#include <stdio.h>
#define PI 3.14

double findarea(double r);
double findvolume(double r);

int main() {
    double r, area, volume;

    printf("Enter the radius: ");
    scanf("%lf", &r);

    area = findarea(r);
    volume = findvolume(r);

    printf("The area of the circle is: %lf\n", area);
    printf("The volume of the sphere is: %lf\n", volume);

    return 0;
}

double findarea(double r) {
    return PI * r * r;
}

double findvolume(double r) {
    return 4.0 / 3.0 * PI * r * r * r;
}

