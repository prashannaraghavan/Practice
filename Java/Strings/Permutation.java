class Permutation
{
	static char[] str;

	static void swap(int a,int b)
	{
		char temp = str[b];
		str[b] = str[a];
		str[a] = temp;
	}

	static void permute(char[] s,int l,int r)
	{
		if(l==r)
			System.out.println(s);
		else
		{
			for(int i=l;i<=r;i++)
			{
				swap(l,i);
				permute(s,l+1,r);
				swap(l,i);
			}
		}
	}

	public static void main(String[] args) {
		String s = "ABC";
		str = s.toCharArray();
		int n = s.length();
		
		permute(str,0,n-1);
	}
}