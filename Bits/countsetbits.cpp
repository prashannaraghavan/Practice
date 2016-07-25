#include <iostream>

using namespace std;

int countsetbitsutil(int a)
{
	if (a<=0)
		return 0;
	return ((a%2 == 0) ? 0 : 1) + countsetbitsutil(a/2);
}

int countSetBits(int arr[],int n)
{
	int sum = 0;
	for (int i = 0; i < n; ++i)
	{
		/* code */
		sum	+= countsetbitsutil(arr[i]);
	}

	return sum;
}

int main()
{
	int arr[] = {2,3};
	int l = sizeof(arr)/sizeof(arr[0]);
	cout<<"Count : "<<countSetBits(arr,l);
	return 0;
}