#include<unistd.h>
#include "encrypt.h"
#include "cciph.h"

main(int argc,char * const * argv)
{
	char text[80];
	char c=getopt(argc,argv,"ed");
	switch(c)
	{
		case 'e':
		encryption(text);
		break;
		
		case 'd':
		decryption(text);
		break;
		
		default:
		encryption(text);
	}
	return 0;
}