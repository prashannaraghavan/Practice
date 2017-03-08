#include <iostream>
#include <string.h>

using namespace std;

int isDivBy7(int n)
{
	if(n<0)
		return isDivBy7(-n);

	else if(n==0 || n==7)
		return 1;

	else if(n<10)
		return 0;

	else
		return isDivBy7(n/10 - 2*(n - n/10 * 10) );
}

int main()
{
	string isDivisible ;
	isDivisible = (isDivBy7(48)) ? "Yes" : "No"; 
	cout<<isDivisible;
}