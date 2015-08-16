//strlen & strcpy source code learning
//@ 2015 Starx Inc , sylveryte  :)

#include<stdio.h>

int sytrlen(char* );
void sytrcpy(char* ,char* );

void strcp(char* o,char* c)
{
	while(*o!='\0')
	{
		*c=*o;
		c++;
		o++;
	}
		
}

main()
{
	char original[20];
	char copied[20];
	char copieded[3];                    //less size  try greater size too
	printf("\nEnter string : ");
	gets(original);

	printf("Original : %s",original);
	printf("\nLength : %d",sytrlen(original));
	sytrcpy(original,copied);
	printf("\nCopied : %s\n",copied);
	strcp(original,copieded);
	printf("\nCopiedMine : %s\nYo\n",copieded);
	
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

	