#include<stdio.h>
#include<stdarg.h>
int t=0;
void sumint(int a, ...)
{
	va_list ap;
	va_start(ap, a);
	int i=0;
	while(i++<a)
		t+=va_arg(ap,int);
	va_end(ap);
}

main()
{
	sumint(5,21,3,5,16,17);
	printf("%i",t);
	return 0;
}

