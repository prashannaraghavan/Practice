class BitRep
{
	static String bitRep(int n,int bitSys,int gap)
	{
		StringBuilder sb = new StringBuilder();
		for (int i=bitSys; i>=0;i-- ) {
			sb.append(((n & (1 << i))!=0) ? 1:0);

			if (i%gap == 0) {
					sb.append(" ");
				}	
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(bitRep(5,3,4));
	}
}