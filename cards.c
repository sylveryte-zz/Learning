/*
 *Program to evaluate face(cards) values
 *(c) 2015 Starx INC by Sylveryte
 */

#include<stdio.h>
#include<stdlib.h>

int main()
{
	char card_name[3];
	printf("Enter The card name : ");
	scanf("%2s",&card_name);
	int val=0;
	if(card_name[0]=='K')
	{
		val=10;
	}else if(card_name[0]=='J')
	{
		val=10;
	}else if(card_name[0]=='Q')
	{
		val=10;
	}else if(card_name[0]=='A')
	{
		val=11;
	}else
	{
	val=atoi(card_name);
	}
	printf("Ther card value is  : %i\n",val);
		printf("cO");
	return 21;
	
}