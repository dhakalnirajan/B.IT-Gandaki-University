//Without return type without argument

//#include<stdio.h>
//
//void convert();
//int main(){
//	convert();
//	return 0;	
//}
//void convert(){
//	float c,f;
//	printf("Enter a temp. in degree celcius");
//	scanf("%f", &c);
//	f=c*9/5+32;
//	printf("The temp in degree fahrenheit is %f", f);		
//}

//with argument without return type
//#include<stdio.h>
//
//void convert(float);
//int main(){
//	float c;
//	printf("Enter a temp. in degree celcius");
//	scanf("%f", &c);
//	convert(c);
//	return 0;	
//}
//void convert(float a){
//	float f;
//	f=a*9/5+32;
//	printf("The temp in degree fahrenheit is %f", f);		
//}

//without argument with return type
#include<stdio.h>

//float convert();
//int main(){
//	float f = convert();
//	printf("The temp in degree fahrenheit is %f", f);
//	return 0;	
//}
//float convert(){
//	float c,a;
//	printf("Enter temp in degree celcius");
//	scanf("%f",&c);
//	a = c*9/5+32;
//	return(a);		
//}




//with argument with return type

#include<stdio.h>

float convert(float);
int main(){
	float c,f;
	printf("Enter temp in degree celcius");
	scanf("%f",&c);
	f = convert(c);
	printf("The temp in degree fahrenheit is %f", f);
	return 0;	
}
float convert(float b){
	float a;
	a = b*9/5+32;
	return(a);		
}
