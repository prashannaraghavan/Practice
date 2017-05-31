class GeeksDisplay
{
	static void displayGeeks(String s)
	{
		int n = s.length();
		char[] array = s.toCharArray();

		for (int j=0;j<n ;j++ ) {
			for(int i=0;i<n;i++)
			{
				if(i==j || i==n-j-1)
					System.out.print(array[i]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		displayGeeks("geeksforgeeks");
	}
}