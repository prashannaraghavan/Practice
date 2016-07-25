#include <stdio.h>

int weightedavg(int avg,int cur,int index)
{
	return (avg*index+cur)/(index+1);
}

void avg(int arr[],int l)
{
	int avg = 0;
	int i;

	for ( i = 0; i < l; ++i)
	{
		/* code */
		avg = weightedavg(avg,arr[i],i);
		printf("%d\n", avg);
	}	
}

int main()
{
	int arr[] = {10,20,30,40,50};
	int size = sizeof(arr)/sizeof(arr[0]);
	avg(arr,size);
	return 0;
}