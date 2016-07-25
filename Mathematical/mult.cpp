#include <iostream>
#include <stdio.h>

int mult(int a,int b)
{
	if (a==0 || b==0)
		return 0;

	if (b > 0)
	{
		return (a+mult(a,b-1));
	}

	if (b < 0)
	{
		return -mult(a,-b);
	}
}

int main()
{
	printf("Answer : %d",mult(-6,5));
	return 0;
}