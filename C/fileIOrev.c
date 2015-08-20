#include<stdio.h>
#include<string.h>
main()
{
	char s[80];
	while(scanf("%[^\n]\n",s)==1)
		fprintf(stdout,"%s\n",s);
	return 0;
}