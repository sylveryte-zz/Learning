//not good yet, linkedlist working properly

#include<stdio.h>
#include<stdlib.h>

enum qt{count,weight,volume};
typedef union 
{
	int count;
	float weight;
	double volume;
	enum qt type;
}quantity;

typedef struct linkedlist
{
	quantity data;
	struct linkedlist * next;
}linkedlist;

void show(linkedlist* m)
{
	
	while(m->next!=0)
	{
		switch(m->data.type)
		{
			case count :	{
								printf("ItemC : %i\n",m->data.count);
								break;
							}
			case weight :	{
								printf("ItemW : %i\n",m->data.weight);
								break;
							}
			case volume :	{
								printf("ItemV : %i\n",m->data.volume);
								break;
							}
		}
		
		m=m->next;
	}
}

void add(linkedlist* l)
{
	char c,t;
	int i=1;
	while(l->next!=0)
		l=l->next;
	do
	{
		starx:
		printf("Type of data??(c=countatble,w=weight,v=volume) : ");
		t=getchar();
		switch(t)
		{
			case 'c' :	{
								printf("Enter item : ");
								scanf("%i",&(l->data.count));
								l->data.type=count;
								break;
							}
			case 'w' :	{
								printf("Enter item : ");
								scanf("%f",&(l->data.weight));
								l->data.type=weight;
								break;
							}
			case 'v' :	{
								printf("Enter item : ");
								scanf("%f",&(l->data.volume));
								l->data.type=volume;
								break;
							}
		default :{printf("Bad Choice!!Try again"); goto starx;}
		}
		l->next=malloc(sizeof(linkedlist));
		l=l->next;
		l->next=0;
		printf("More??(y/n) : ");
		c=getchar();
	}while(i--);//c!='n'||c!='N');	
}
main()
{
	linkedlist* m=malloc(sizeof(linkedlist));
	m->next=0;
	add(m);
	show(m);
	return 0;
}