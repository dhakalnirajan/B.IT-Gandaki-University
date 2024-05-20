#include <stdio.h>
#include <graphics.h> // must be included for every graphics program
#include <conio.h>
#include <dos.h>

int main(){
    int gd = DETECT, gm;  // gd = detects best available graphics driver, gm = graphics mode
    initgraph(&gd, &gm, (char*)""); // for initializing graph mode
    /*
    above 2 steps are must for every graphics program.
    declaration of any variables must be done before calling initgraph function.
    next write code for producing requiring design or drawing object
    */

    line(100,100, 200, 200);  // draws a line segment.
    getch();
    closegraph();
    return 0;
}
