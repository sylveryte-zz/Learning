#include<stdio.h>

main(char * arg[])
{
	char s[80];
	char* m=s;
	int i;
	FILE * rfile=fopen("in.txt","r");
	FILE * file1=fopen("o1.txt","w");
	FILE * file2=fopen("o2.txt","a");
	int c,d;
	fscanf(rfile,"%i %i %[^\n]s",&c,&d,s);
	while(*m)
		fprintf(file1,"%s\n",m++);
	for(i=0;i<21;i++,fprintf(file2,"%i\n",i));
	fprintf(stderr,"%i %i",21,4);
	return 0;
}