#include <iostream>

using namespace std;

void swap(int *a,int *b)
{
	int t=*b;
	*b=*a;
	*a=t;
}

int partition(int arr[],int low,int high)
{
	int x = arr[high];
	int i=low-1;

	for (int j = low; j <= high-1; ++j)
	{
		if(arr[j] <= x)
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

void print(int arr[],int count)
{
	for (int i = 0; i < count; ++i)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}

bool hasSum(int a[],int n,int sum)
{
	quickSort(a,0,n);
	
	int s=0,e=n-1;

	while(s<e)
	{
		if (a[s]+a[e] == sum)
			return true;
		else if(a[s]+a[e] < sum)
			s++;
		else if(a[s]+a[e] > sum)
			e--;
		else
			return false;
	}

	return false;
}

int main()
{
	int arr[] = {1,4,45,6,10,-8};
	int sum = 16;
	int n = sizeof(arr)/sizeof(arr[0]);
	hasSum(arr,n,sum) ? cout<<"Yes"<<endl : cout<<"No"<<endl;
	return 0;
}