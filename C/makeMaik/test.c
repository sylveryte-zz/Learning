#include<stdio.h>

main(int argc,char * const * argv)
{
	char text[80];
	FILE* in=fopen("in.txt","r");
	FILE* out=fopen("out.txt","w");
	fscanf(in,"%[^\n]s",text);
	fprintf(out,"\n%s",text);
	return 0;
	}
	