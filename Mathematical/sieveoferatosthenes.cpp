#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void sieve(int n)
{
	int arr[n+1];
	memset(arr,1,sizeof(arr));

	for (int i = 2; i*i <= n; ++i)
	{
		if (arr[i] == 1)
		{
			for (int j = i*2; j <= n; j += i)
			{
				arr[j] = 0;
			}
		}
		
	}

	for (int i = 2; i < n; ++i)
	{
		/* code */
		if (arr[i] != 0)
		{
			/* code */
			printf("%d ", i);
		}
		
	}

	printf("\n");
}

int main()
{
	int num=50;
	sieve(num);
	return 0;
}