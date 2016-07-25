#include <stdio.h>
#include <string.h>

void swap(char *a,char *b)
{
	char* tmp ;
	tmp = *b;
	*b = *a;
	*a = tmp;
}

void permutation(char* a,int s,int e)
{
	int i;

	if (s==e)
	{
		printf("%s\n", a);
	}

	else
	{
		for (i = s; i <= e; i++)
		{
			swap(a+s,a+i);
			permutation(a,s+1,e);
			swap(a+s,a+i);
		}
	}
	
}

int main()
{
	char str[]="ABC";
	int len = strlen(str);
	permutation(str,0,len-1);
	return 0;
}
