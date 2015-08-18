#include<stdio.h>

main()
{
	char s[80];
	char *m=s;
	scanf("%[^\n]s",s);
	while(*m)
		printf("\n%s",m++);
	return 0;
}