#include <iostream>

using namespace std;

void merge(int arr[],int l,int m,int r)
{
	int i,j,k;
	int n1 = m-l+1;
	int n2 = r-m;

	int L[n1],R[n2];

	for(i=0;i<n1;i++)
	{
		L[i] = arr[l+i];
	}

	for(j=0;j<n2;j++)
	{
		R[j] = arr[m+1+j];
	}

	i=0;
	j=0;
	k=l;

	while(i<n1 && j<n2)
	{
		if(L[i] <= R[j])
		{
			arr[k] = L[i];
			i++; 
		}

		else
		{
			arr[k] = R[j];
			j++; 
		}

		k++;
	}

	while(i<n1)
	{
		arr[k] = L[i];
		i++;
		k++;
	}

	while(j<n2)
	{
		arr[k] = R[j];
		j++;
		k++;
	}

}

void mergeSort(int arr[],int l,int r)
{
	int m = l + (r-l)/2;
	if(l<r)
	{
		mergeSort(arr,l,m);
		mergeSort(arr,m+1,r);
		merge(arr,l,m,r);
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

int main()
{
	int arr[] = {12,11,13,5,6,7,8};
	int r = sizeof(arr)/sizeof(arr[0]);

	print(arr,r);
	mergeSort(arr,0,r-1);
	print(arr,r);
	return 0;
}