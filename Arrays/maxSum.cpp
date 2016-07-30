#include <iostream>

using namespace std;

int maxSum(int arr[],int n)
{
	int maxEnd=0,maxSoFar=0;

	for (int i = 0; i < n; ++i)
	{
		maxEnd += arr[i];

		if (maxEnd < 0)
			maxEnd = 0;
		if (maxSoFar < maxEnd)
			maxSoFar = maxEnd;
	}

	return maxSoFar;
}

int main()
{
	int arr[] = {-2,-3,4,-1,-2,1,5,-3};
	cout<<maxSum(arr,sizeof(arr)/sizeof(arr[0]));
	return 0;
}