#include <iostream>
#include <string.h>

#define RANGE 150

using namespace std;

void countingSort(char arr[])
{
	int output[strlen(arr)];
	int count[RANGE+1],i;

	memset(count,0,sizeof(count));

	for (int i = 0; arr[i]; ++i)
		++count[arr[i]];

	for (int i = 1; i<=RANGE; ++i)
		count[i] += count[i-1];

	for (int i = 0; arr[i]; ++i)
	{
		output[count[arr[i]]-1] = arr[i];
		--count[arr[i]];		
	}

	for (int i = 0; arr[i]; ++i)
		arr[i] = output[i];
}

void print(char arr[])
{
	for (int i = 0; i < strlen(arr); ++i)
	{
		cout<<arr[i];
	}
}

int main()
{
	char arr[] = "geeksforgeeks";
	countingSort(arr);
	cout<<arr;
	return 0;
}