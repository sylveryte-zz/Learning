//encryption
#include "encrypt.h"
void encrypt(char * s)
{
	while(*s)
		*(s++)^=31;
}