#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

/* Method 1
int pow(int a,int b)
{
	int sum;
	int inc = a;

	for (int i = 1; i < b; ++i)
	{
		
		sum = 0;
		for (int i = 0; i < a; ++i)
		{
			
			sum += inc; 
		}

		inc = sum;
	}

	return sum;
}
*/

int mult(int a,int b)
{
	if(b==0)
		return 0;
	else
		return (a+mult(a,b-1));
}

int pow(int a,int b)
{
	if(b==0)
		return 1;
	else
		return mult(a,pow(a,b-1));
}

int main()
{
	cout<<"Answer : "<<pow(7,3)<<endl;
	return 0;
}