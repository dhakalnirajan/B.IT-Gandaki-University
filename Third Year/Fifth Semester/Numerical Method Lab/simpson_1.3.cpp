#include<stdio.h>
#include<conio.h>
#include<math.h>
#define f(x) (x*exp(x))

int main(){
	float a,b,h,sum=0;
	int i,n;
	printf("Enter upper limit a and lower limit b: ");
	scanf("%f %f", &a, &b);
	printf("Enter no of intervals: ");
	scanf("%d",&n);
	h=(b-a)/n;
	sum=f(a)+f(b);
	for(i=1;i<n;i++){
		a+=h;
		if((i%2)!=0)
		sum+=4*f(a);
		else
		sum+=2*f(a);
	}
	printf("sum=%f",sum*h/3);
}
