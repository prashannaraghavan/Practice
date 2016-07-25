#include <iostream>

using namespace std;

int addone(int x)
{
	int m=1;

	while(x&m)
	{
		x ^= m;
		m <<= 1;
	}

	x ^= m;
	return x;
}

int main()
{
	int x=13;
	cout<<(-(~x));
	return 0;
}