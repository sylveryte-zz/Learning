#include"encrypt.h"
void encryption(char * text)
{
		FILE* out=fopen("out.txt","w");
		FILE* in=fopen("in.txt","r");
		printf("\nEncrypting");
		while((fscanf(in,"%[^\n]\n",text))==1)
		{
			cciph(text);
			encrypt(text);
			fprintf(out,"%s\n",text);
		}
			fprintf(stdout,"\nEncryption DONE!");
	}