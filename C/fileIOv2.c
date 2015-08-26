#include<stdio.h>

main(int argc,char * arg[])
{
	char s[80];
	char* m=s;
	long int i;
	FILE * rfile=fopen(arg[1],"r+");
//	FILE * file1=fopen(arg[2],"w");
//	FILE * file2=fopen(arg[3],"a");
	fscanf(rfile,"%[^\n]",m);
	fseek(rfile,1,SEEK_END);
	i=ftell(rfile);
	fprintf(rfile,"\n");
	while(*m)
		fprintf(rfile,"%s\n",m++);
		//printf("%s\n",m++);
	fprintf(stderr,"Succeed!! %i %s",i,m);
	return 0;
}