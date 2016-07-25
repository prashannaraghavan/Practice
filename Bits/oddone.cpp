#include <iostream>

using namespace std;

int oddone(int arr[],int n)
{
	int ones=0,twos=0,common=0;

	for (int i = 0; i < n; ++i)
	{
		/* code */
		twos = twos | (ones & arr[i]);

		ones ^= arr[i];

		common = ~(ones & twos);

		twos &= common;

		ones &= common;
	}

	return ones;
}

int main()
{
	int arr[] = {3,3,3,2,2,1,0,2,0,0};
	cout<<"Odd one : "<<oddone(arr,sizeof(arr)/sizeof(arr[0]));
	return 0;	
}