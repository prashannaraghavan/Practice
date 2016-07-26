#include <iostream>

using namespace std;

void swap(int* a, int* b)
{
	int t = *a;
	*a = *b;
	*b = t;
}

void print(int arr[],int count)
{
	for (int i = 0; i < count; ++i)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}

int partition(int arr[],int low,int high)
{
	int pivot = arr[high];
	int i=low-1;

	//cout<<pivot<<i;

	for (int j = low; j <= high-1; j++)
	{
		if (arr[j] <= pivot)
		{
			i++;
			swap(&arr[j],&arr[i]);
		}
	}

	swap(&arr[high],&arr[i+1]);
	return i+1;
}

void quickSort(int arr[],int l,int r)
{
	if(l<r)
	{
		int p = partition(arr,l,r);
		quickSort(arr,l,p-1);
		quickSort(arr,p+1,r);
	}
}

int main()
{
	int arr[] = {10,7,8,9,1,5};
	int len = sizeof(arr)/sizeof(arr[0]);
	print(arr,len);
	quickSort(arr,0,len-1);
	print(arr,len);
}