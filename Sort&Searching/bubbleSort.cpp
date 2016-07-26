#include <iostream>

using namespace std;

void swap(int *a,int *b)
{
	int *temp;
	*temp = *b;
	*b = *a;
	*a =*temp;
}

void printArr(int arr[],int count)
{
	for (int i = 0; i < count; ++i)
	{
		/* code */
		cout<<arr[i]<<" ";
	}
}

void bubbleSort(int arr[],int l,int r)
{
	bool x;
	int count=0;
	do
	{
		x=false;
		for (int i = 0; i < r-1; ++i)
		{
			/* code */
			if (arr[i]>arr[i+1])
			{
				x=true;
				swap(&arr[i],&arr[i+1]);
			}
		}
		count++;
	}while(x);
	
	cout<<count<<endl;
	printArr(arr,r);
}

int main()
{
	int arr[] = {5,1,4,2,8};
	int l = sizeof(arr)/sizeof(arr[0]);
	bubbleSort(arr,0,l);
	return 0;
}