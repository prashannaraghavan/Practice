#include <iostream>
#include <string.h>

using namespace std;

int day(int d,int m,int y)
{
	int t[] = {0,3,2,5,0,3,5,1,4,6,2,4};
	y -= m<3; 

	return (y + y/4 - y/100 + y/400 + t[m-1] + d ) % 7;
}

int main()
{
	 string days[] = {"Su","M","T","W","Th","F","Sa"}; 
	 int dayIndex = day(24,9,2007);
	 cout<<"Day is "<<days[dayIndex];
}