//strlen & strcpy source code learning
//@ 2015 Starx Inc , sylveryte 

#include<stdio.h>

int sytrlen(char* );
void sytrcpy(char* ,char* );

main()
{
	char original[20];
	char copied[20];
	printf("\nEnter string : ");
	gets(original);

	printf("Original : %s",original);
	printf("\nLength : %d",sytrlen(original));
	sytrcpy(original,copied);
	printf("\nCopied : %s\nYo\n",copied);
	return 0;
}

void sytrcpy(char* o,char* c)
{
	while((*c++=*o++)!=0)
		;
}

int sytrlen(char* c)
{
	char* s;
	for(s=c;*s;++s)
		;
	return (s-c);
}

	