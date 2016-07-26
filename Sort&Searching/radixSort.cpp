#include <iostream>

using namespace std;

int getMax(int arr[],int n)
{
	int max = arr[0];
	for (int i = 1; i < n; ++i)
	{
		if (arr[i] > max)
		{
			max = arr[i];
		}
	}

	return max;
}

void countingSort(int arr[],int n,int exp)
{
	int output[n];
	int count[10] = {0};

	for (int i = 0; i < n; ++i)
		++count[(arr[i]/exp)%10];

	for (int i = 1; i < 10; ++i)
		count[i] += count[i-1];

	for (int i = n-1; i >= 0; i--)
	{
		output[count[(arr[i]/exp)%10]-1]=arr[i];
		--count[(arr[i]/exp)%10];		
	}

	for (int i = 0; i < n; ++i)
		arr[i] = output[i];

}

void radixSort(int arr[],int n)
{
	int m = getMax(arr,n);

	for (int i = 1; m/i > 0; i *= 10)
		countingSort(arr,n,i);
}

void print(int arr[],int count)
{
	for (int i = 0; i < count; ++i)
		cout<<arr[i]<<" ";
	cout<<endl;
}

int main()
{
	int arr[] = {170,45,75,90,802,24,2,66};
	int len = sizeof(arr)/sizeof(arr[0]);
	radixSort(arr,len);
	print(arr,len);
}