#include <stdio.h>

int main(){
	int i;
	void function_a(int*);

	i=0;
	printf("** main func *** int i = %d\n", i);

	function_a(&i);

	printf("** main func *** int i = %d\n", i);

}

void function_a(int *func_i){
	int local_i = 100;

	printf("** sub func *** int\n");

	printf("before ==== \n");
	printf("local_i = %d\n", local_i);
	printf("func_i  = %d\n", *func_i);

	*func_i = local_i;

	printf("after  ==== \n");
	printf("local_i = %d\n", local_i);
	printf("func_i  = %d\n", *func_i);
}