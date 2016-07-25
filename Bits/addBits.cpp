#include <iostream>

using namespace std;

int add(int a,int b)
{
	int y;
	int x ;

	while(b!=0)
	{
		y = (a & b);
		a = (a ^ b);
		b=y<<1;
	}
	
	return a;
}

int main()
{
	int a=5,b=6;

	cout<<"Answer : "<<add(a,b);

	return 0;
}