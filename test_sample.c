/*----------------------------------------------------------------*/
/* array test                                                     */
/*----------------------------------------------------------------*/
/* declare */
#include <stdio.h>
#define MY_MAXNO 3
void initial_setchar(double []);

/* function */
void initial_setchar(double w[]) {
	w[0] = 0.0;
	w[1] = 1.0;
	w[2] = 0.5;
}

/* main */
int main (int argc, char **argv) {
	int i;
	double w[2];

	printf("*** Start Main Function ***\n");
	initial_setchar(w);

	for (i = 0; i < MY_MAXNO; i++) {
		printf("w[%d] = %f \n", i, w[i]);
	}
	printf("\n");
}
