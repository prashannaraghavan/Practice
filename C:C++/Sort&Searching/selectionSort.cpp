#include <iostream>

using namespace std;

void swap(int *a,int *b)
{
	int *temp;
	*temp = *b;
	*b = *a;
	*a = *temp;
}

void printArr(int arr[],int l)
{
	for (int i = 0; i < l; ++i)
	{
		/* code */
		cout<<arr[i]<<" ";
	}
}

void selectionSort(int arr[],int l,int r)
{
	for (int i = 0; i < r-1; ++i)
	{
		/* code */
		int x=i;
		for (int j = i+1; j < r; ++j)
		{
			/* code */
			if(arr[j] < arr[x])
				swap(&arr[j],&arr[x]);
		}
	}

	printArr(arr,r);
}

int main()
{
	int arr[] = {2,8,5,3,1};
	int len = sizeof(arr)/sizeof(arr[0]);
	selectionSort(arr,0,len);
	return 0;
}