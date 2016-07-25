#include <stdio.h>
#include <stdlib.h>

int fact;

int factorial(int n)
{
	if (n>0)
	{
		/* code */
		return n * factorial(n-1);
	}
	
	return 1;
}

int main()
{
	fact = 0;
	printf("%d\n", factorial(4)); ;
	return 0;
}