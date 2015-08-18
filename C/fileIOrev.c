#include<stdio.h>
#include<string.h>
main()
{
	char s[80];
	while(scanf("%[^\n]s",s)==1)
		fprintf(stdout,"%s\n",strrev(s));
	return 0;
}