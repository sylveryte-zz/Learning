//works great run like >cmdoptionargs.exe -0 -k 4 -t from gkp to ltt

#include<stdio.h>
#include<unistd.h>
main(int argc,char* const* argv)
{
//	char* yo;
	int i,kidcount=0,kid=0,tatkal=0,online=0;
	char ch;
	while((ch=getopt(argc,argv,"otk:"))!=EOF)
		switch(ch)
		{
			case 'o' : online=1; break;
			case 'k' : kid =1; kidcount = atoi(optarg); break;
			case 't' : tatkal =1; break;
			default : printf("\nInvalid argument option!!\n");
		}
		argc-=optind;
		argv+=optind;
		if(tatkal)
			printf("tatkal ");
		if(kid)
			printf("kids : %i ",kidcount);
		if(online)
			printf("online ");
		for(i=0;i<argc;printf("%s ",argv[i]),i++);
}