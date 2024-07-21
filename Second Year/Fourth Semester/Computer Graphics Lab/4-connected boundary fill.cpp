#include <stdio.h>
#include <dos.h>
#include <graphics.h>
#include <conio.h>

void boundary_fill(int x, int y, int fcolor, int bcolor){
	if(getpixel(x,y)!= bcolor && (getpixel(x,y) != fcolor)){
		delay(10);
		putpixel(x,y,fcolor);
		boundary_fill(x+1, y, fcolor, bcolor);
		boundary_fill(x-1, y, fcolor, bcolor);
		boundary_fill(x, y+1, fcolor, bcolor);
		boundary_fill(x, y-1, fcolor, bcolor);
	}
}

int main(){
	int x, y, fcolor, bcolor;
	int gd = DETECT, gm;
	initgraph(&gd, &gm, (char*)"");
	printf("Enter the seed point (x,y):");
	scanf("%d%d", &x, &y);
	printf("Enter boundary color:");
	scanf("%d", &bcolor);
	printf("\nEnter new color: ");
	scanf("%d", &fcolor);
	circle(100,200, 45);
	boundary_fill(x,y,bcolor, fcolor);
	getch();
	return 0;
}

/*
When running the code, the seed points must be greater than the values circle function has stored in the parameter.
Also, the values only work with boundary color 15. Fill color can be any values.
*/

