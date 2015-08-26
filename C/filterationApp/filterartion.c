//this is an awesome project thank you old me!! :)
//Im feeling so smart right now // wrote look fx !! Yo!!!!!!!!!!
#include<stdio.h>
#include<stdlib.h>

char tracks[100][80]={};

int look(char* s,char* trk)
{
	char* first=s;

	if(!*trk)
		return 0;

	
	while(*s!=*trk&&*trk)                                   //gets first initial present in string
		trk++;
	
	while(*s++)
		trk++;
	trk--;
	s--;
	s--;

	if(*s==*trk)
		return (int)trk;
	else
		return look(first,trk);	
	
	printf("\n\nSylveryte is Red Robin!!\n\n");
	return 0;	
}


void search(FILE* out,char* toSearch)
{
	int i=0;
	while(tracks[i++][0])
		if(look(toSearch,tracks[i]))
			fprintf(out,"%s\n",tracks[i]);
}

main()
{
	FILE* in=fopen("in.txt","r");
	FILE* out=fopen("out.txt","w"); 
	int l;
	char toSearch[80];
	int i=0;
	
	while((fscanf(in,"\n%[^\n]s",&tracks[i++]))>0)
		;
	//l=fscanf(in,"%[^\n]s",&tracks[0]);
	printf("\nEnter word : ");
	scanf("%79s",&toSearch);
	//printf("%s\n",toSearch);
	search(out,toSearch);
	fclose(in);
	fclose(out);
	printf("\nSucess!!\n press any key to open output text file!!\n");
	getch();
	system("out.txt");
}


//development 
/*
int look(char* s,char* trk)
{
	//test codes
		//printf("\ns:%c,trk:%c,trk++:%c",*s,*trk,*trk++);
		while(*trk)
			printf("\ntrk:%c\n",*(trk++));
	//	trk--;
		
	char* first=s;
	
	//printf("\ns=%s,trk=%s",s,trk);
	
	if(!*trk)
		return 0;
	
	//printf("\nSTART s>%c,trk>%c",*s,*trk);
	
	while(*s!=*trk&&*trk)                                   //gets first initial present in string
		trk++;
		
	
	
	//test codes
//		printf("\nSTART s>%c,trk>%c",*s,*trk);
	//	printf("\ns=%s,trk=%s",s,trk);
		
	while(*s++)
		trk++;
	trk--;
	s--;
	s--;
	
	//test codes
		//printf("\nEND   s:%c,trk:%c",*s,*trk);
		
	
		
	if(*s==*trk)
		return (int)trk;
	else
		return look(first,trk);
			
	printf("\n\nBATMAN is here!!\n\n");
	return 0;	
}


void search(char* toSearch)
{
	int i=0;
	while(tracks[i++][0])
		if(look(toSearch,tracks[i]))
			printf("\nTrack:%s",tracks[i]);
}

main()
{
	char* toSearch;
	int i=0;
	printf("\nEnter word : ");
	scanf("%79s",toSearch);
	search(toSearch);
	printf("\n");
	
	
	//test codes	
	if(look("tere",tracks[1]))
		printf("\n\nholaaa!!\n\n");
	else
		printf("\n\n:/\n\n");
	
	
}*/