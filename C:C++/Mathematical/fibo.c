#include <stdio.h>
#include <stdlib.h>
#define MAX 100
//int fibonacci(int n);


/* Method 1
int sum;
int fibonacci(int n)
{
	if (n<2)
	{
		return n;
	}

	else
		return fibonacci(n-1)+fibonacci(n-2);
}

int main()
{
	sum = 0;
	printf("Answer : %d\n",fibonacci(9));
	return 0;
}
*/

/* Method 2
int fib[MAX];

void printArray(int fib[],int size)
{
	int i;
	for (i = 0; i < size; ++i)
	{
		printf("%d ",fib[i]);
	}
}

void fibonacci(int n)
{
	int i=0;

	while(i<n)
	{
		if (i<2)
		{
			fib[i]=i;
		}

		else
			fib[i] = fib[i-2]+fib[i-1];

		i++;
	}

	printArray(fib,n);
}
*/

int fibonacci(int n)
{
	int a=0,b=1,c;

	if (n==0)
		return a;

	int i=2;
	while(i<=n)
	{
		c=a+b;
		a=b;
		b=c;
		i++;
	}

	return b;
}

int main()
{
	printf("Answer : %d",fibonacci(10));
	return 0;
}