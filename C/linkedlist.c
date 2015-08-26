#include<stdio.h>
#include<stdlib.h>

typedef struct linkedlist
{
	int data;
	struct linkedlist * next;
}linkedlist;

void add(linkedlist* l)
{
	char c;
	while(l->next!=0)
		l=l->next;
	do
	{
		printf("Enter data : ");
		scanf("%i",&(l->data));
		l->next=malloc(sizeof(linkedlist));
		l=l->next;
		l->next=0;
		printf("More ?/ (y/n) ");
		scanf(" %c",&c);
	}while(c!='n');
}

void show(linkedlist* l)
{
		while(l->next!=0)
		{
			printf("%i\t",l->data);
			l=l->next;
		}
}

main()
{
	linkedlist* l=malloc(sizeof(linkedlist));
	l->next=0;
	add(l);
	show(l);
}