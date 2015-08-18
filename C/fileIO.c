#include<stdio.h>

main()
{
	char s[80];
	char* m=s;
	int c,d;
	scanf("%i %i %[^\n]s",&c,&d,s);
	while(*m)
		printf("\n%s",m++);
	fprintf(stderr,"%i %i",c,d);
	return 0;
}