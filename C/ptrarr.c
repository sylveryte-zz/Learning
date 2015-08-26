#include<stdio.h>
#include<stdlib.h>

enum type_v
{
	car,bike,plane
};

struct vehicle
{
	int wheels;
	char* name;
	enum type_v type;
};

void drive(struct vehicle * v)
{
	printf("%s is a car and it drives on %i wheels! \n",v->name,v->wheels);
}

void ride(struct vehicle * v)
{
	printf("%s is a bike and it rides on %i wheels! \n",v->name,v->wheels);
}

void fly(struct vehicle * v)
{
	printf("%s is a plane and it flies with 2 wings and also have %i wheels! \n",v->name,v->wheels);
}


main()
{
	int i=0;
	struct vehicle mve[]={
		{4,"Rolls Royce",car},
			{2,"Bati",bike},
				{2,"Kater",plane},
					{4,"Muscle",car},
						{2,"Mountain Bike BMX",bike}
	};
	void (*takeon[])(struct vehicle*)={drive,ride,fly};
	for(i=0;i<5;i++)
		takeon[mve[i].type](&mve[i]);
	return 0;
}



















