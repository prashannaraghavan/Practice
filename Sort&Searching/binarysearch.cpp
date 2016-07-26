#include <iostream>

using namespace std;

int binarySearch(int arr[],int l,int r,int x)
{
	int mid = l+(r-l)/2;

	if (arr[mid] == x)
		return mid;
	else if (arr[mid] < x)
		return binarySearch(arr,mid+1,r,x);
	else if (arr[mid] > x)
		return binarySearch(arr,l,mid-1,x);
	else
		return -1;
}

int main()
{
	int arr[] = {1,2,3,4,5};
	int len = sizeof(arr)/sizeof(arr[0]);
	int result = binarySearch(arr,0,len-1,5);
	(result != -1) ? cout<<"Is the "<<result+1<<" element of the array"<<endl : cout<<"Not found"<<endl;
	return 0;
}