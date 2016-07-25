#include <iostream>
#include <stdio.h>

int sqrt(int n)
{
	int x = n;
	int y = 1;
	double e = 0.00001;

	while(x-y > e)
	{
		x = (x+y)/2;
		y = n/x;
	}

	return x;
}

int main()
{
	int n = 3;
	printf("Square root of %d: %d",n,sqrt(n));
	return 0;
}