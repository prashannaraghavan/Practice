#include <iostream>

using namespace std;

void print(int arr[],int count)
{
	for (int i = 0; i < count; ++i)
	{
		cout<<arr[i]<<" ";
	}
}

void insertionSort(int arr[],int l,int r)
{
	int j,key;
	for (int i = 1; i < r; ++i)
	{
		key = arr[i];
		j=i-1;

		while(j>=0 && arr[j]>key)
		{
			arr[j+1] = arr[j];
			j -= 1;
		}

		arr[j+1]=key;
	}

	print(arr,r);
}

int main()
{
	int arr[] = {12,11,13,5,6};
	int len = sizeof(arr)/sizeof(arr[0]);
	insertionSort(arr,0,len);
	return 0;
}