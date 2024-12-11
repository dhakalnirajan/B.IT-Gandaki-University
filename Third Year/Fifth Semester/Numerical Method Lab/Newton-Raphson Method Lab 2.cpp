// Newton-Raphson Method

#include <stdio.h>
#include <math.h>
#include <process.h>

#define f(x) (x*x-7*x+10)
#define g(x) 2*x-7
#define e 0.0001

int main(){
	float x0, x1, f0, g0, E;
	printf("Enter initial guess:\n");
	scanf("%f", &x0);
	f0 = f(x0);
	g0 = g(x0);
	
	if(g0==0){
		exit(1);
	}
	
	do{
		f0 = f(x0);
		g0 = g(x0);
		x1 = x0 - (f0/g0);
		E = fabs((x1-x0)/x1);
		x0 = x1;
	}
	while(E>e);
	
	printf("\n Required Root is: %f", x1);
	
	return 0;
}
