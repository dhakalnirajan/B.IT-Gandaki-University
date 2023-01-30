// Input Radius of Circle and Print its Area
#include <stdio.h>
int main() {
	float r, pi = 3.14, area;
	printf("""Enter radius of circle: ");
	scanf("%f", &r);
	area = pi*r*r;
	printf("The area of the circle is: %f", area);
	return 0;
}