#include<stdio.h>
#include<graphics.h>
#include<conio.h>
#include<dos.h>
void boundary_fill(int,int,int,int);
int main(){
	int gd=DETECT,gm;
	int x,y,fcolor,bcolor;
	initgraph(&gd,&gm,(char*)"");
	printf("Enter the seed point(x,y): ");
	scanf("%d%d",&x,&y);
	printf("Enter boundry color: ");
	scanf("%d",&bcolor);
	printf("Enter new color: ");
	scanf("%d",&fcolor);
	circle(100,200,45);
	boundary_fill(x,y,fcolor,bcolor);
	getch();
	closegraph();
	return 0;
}
void boundary_fill(int x,int y, int fcolor,int bcolor){
	 if((getpixel(x,y)!=bcolor)&&(getpixel(x,y)!=fcolor)){
	 	delay(10);
	 	putpixel(x,y,fcolor);
	 	boundary_fill(x+1,y,fcolor,bcolor);
	 	boundary_fill(x-1,y,fcolor,bcolor);
	 	boundary_fill(x,y+1,fcolor,bcolor);
	 	boundary_fill(x,y-1,fcolor,bcolor);
	 }
};
