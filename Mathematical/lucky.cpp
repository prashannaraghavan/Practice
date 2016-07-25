#include <iostream>
#include <stdio.h>
#include <stdlib.h>

int isLucky(int n)
{
	static int counter = 2;

	if (counter > n)
		return 1;

	if (n % counter  == 0)
		return 0;

	n -= n/counter;
	counter++;

	return isLucky(n);
}

int main()
{
	if (isLucky(13))
	{
		/* code */
		printf("The number is lucky\n");
	}

	else
		printf("The number is not lucky\n");
	
	return 0;
}