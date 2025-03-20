#include <stdio.h>
#include <math.h>

#define f(x)(x*x-7*x+10)
#define e 0.0001

int main(){
	float x1, x2, x0, f1, f2, f0;
	
	do{
		printf("Enter any two variables:");
		scanf("%f%f", &x1, &x2);
		f1=f(x1);
		f2=f(x2);
	}
	while(f1 * f2 > 0);
	
	do{
		x0 = (x1+x2)/2;
		f0=f(x0);
		if(f0 == 0){
			break;
		}
		
		if(f1*f0 < 0){
			x2 = x0;
			f2 = f0;
		}
		else{
			x1 = x0;
			f1 = f0;
		}
	}
	
	while((fabs(x2-x1))>=e);
		printf("Required Root is: %f", x0);
	
	return 0;
}