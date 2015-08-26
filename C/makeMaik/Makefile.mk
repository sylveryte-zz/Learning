encypt.o : encrypt.c 
	gcc -c encrypt.c
cciph.o : cciph.c 
	gcc -c cciph.c
launch.o : launch.c
	gcc -c launch.c 
launch : encrypt.o launch.o cciph.o 
	gcc *.o -o launch
 