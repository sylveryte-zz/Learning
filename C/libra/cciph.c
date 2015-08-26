//ceasor cipher key 3
#include "cciph.h"
void cciph(char * s)
{
	while(*s)
	{
		*(s++)+=3;
	}
}

void dciph(char* s)
{
	while(*s)
	{
		*(s++)-=3;
	}
}