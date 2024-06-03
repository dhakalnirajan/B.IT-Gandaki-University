#include <stdio.h>
#include <graphics.h>
#include <conio.h>
#include <dos.h>

int main(){
	int x, y, x1, y1, x2, y2, p, dx, dy;
	int gd = DETECT, gm;
	initgraph(&gd, &gm, (char*)"");
	printf("\nEnter the x-coordinate of the first point ::");
	scanf("%d", &x1);
	printf("\nEnter the y-coordinate of the first point ::");
	scanf("%d", &y1);
	printf("\nEnter the x-coordinate of the second point ::");
	scanf("%d", &x2);
	printf("\nEnter the y-coordinate of the second point ::");
	scanf("%d", &y2);
	x= x1;
	y = y1;
	dx = x2 - x1;
	dy = y2-y1;
	putpixel(x,y,2);
	p = (2 * dy - dx);
	while(x<=x2){
		if(p<0){
			x = x + 1;
			p = p + 2 * dy;
		}
		else{
			x = x + 1;
			y = y + 1;
			p = p + (2 *dy) - (2 *dx);
		}
		
		putpixel(x,y,8);
	}
	getch();
	closegraph();
}

// This algorithm uses neither small nor larger values. Therefore, the values should not exceed 50 at lowest and 300 at max.

float round(float a){
	int b = a + 0.5;
	return b;
}
