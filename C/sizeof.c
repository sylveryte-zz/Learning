//sizeof matters
#include<stdio.h>
main()
{
	int a=0;
	int* p=&a;
	char c='a';
	long l=123;
	double d=232.42;
	float f=1;
	long long int llt=2342;
	printf("int  : %i",sizeof(a));
	printf("\nchar : %i",sizeof(c));
	printf("\ndouble : %i",sizeof(d));
	printf("\nfloat  : %i",sizeof(f));
	printf("\nlong : %i",sizeof(l));
	printf("\nllt  : %i",sizeof(llt));
	printf("\nptr  : %i",sizeof(p));
	
	
}