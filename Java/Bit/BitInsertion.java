class BitInsertion
{
	static int insert(int n,int m,int i,int j)
	{
		int allones = ~0;
		int left =  (allones << (j+1));
		int right = (1 << i) - 1;
		int mask = left | right;
		int r = n & mask;
		int shift = (m << i);
		return r | shift;
	}

	public static void main(String[] args) {
		int n=(1<<10);
		int m = 19;
		int i=2;
		int j=6;
		System.out.println("Ans : "+insert(n,m,i,j));
	}
}