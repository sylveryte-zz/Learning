#include"encrypt.h"
void decryption(char * text)
{
		FILE* out=fopen("out.txt","w");
		FILE* in=fopen("in.txt","r");
		printf("\nDecrypting");
		while(fscanf(in,"%79[^\n]\n",text)==1)
		{
			encrypt(text);
			dciph(text);
			fprintf(out,"%s\n",text);
		}
		printf("\nDecryption DONE!!");
	}