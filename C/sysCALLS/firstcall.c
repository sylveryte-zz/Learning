#include <stdio.h>
#include <math.h>
#include <time.h>
char * now()
{
    time_t l;
    time(&l);
    return asctime(localtime(&l));
}

int main()
{
   char str[80];
   char l[80];
   char* k=now();
   printf("%s",now());
	scanf("%79s",l);
   sprintf(str, "echo %s %s >> reports.log",l,"kel");
   printf("%s",str);
   system(str);
   
   return(0);
}
