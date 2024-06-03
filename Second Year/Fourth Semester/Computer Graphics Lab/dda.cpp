#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<dos.h>
float round(float a){
	int b=a+0.5;
	return b;
}
int main(){
	int x,y,x1,y1,x2,y2,p,dx,dy,steps,xincr,yincr;
	int gd = DETECT,gm;
	initgraph(&gd,&gm, (char*)"");
	printf("\nEnter the x-coordinate of the first point ::");
	scanf("%d", &x1);
	printf("\nEnter the y-coordinate of the first point ::");
	scanf("%d", &y1);
	printf("\nEnter the x-coordinate of the second point ::");
	scanf("%d", &x2);
	printf("\nEnter the y-coordinate of the second point ::");
	scanf("%d", &y2);
	dx=x2-x1;
	dy=y2-y1;
	if(abs(dx)>abs(dy))
	steps=abs(dx);
	else{
		steps=abs(dy);
		xincr=dx/steps;
		yincr=dy/steps;
		x=x1;
		y=y1;
	}
	for(int k=1;k<=steps;k++){
		delay(100);
		x+=xincr;
		y+=yincr;
		putpixel(round(x),round(y),WHITE);
	}
	outtextxy(200,20,"DDA");
	outtextxy(x1+5,y1-5,"(x1,y1)");
	outtextxy(x2+5,y2+5,"(x2,y2)");
	getch();
	closegraph();
}
