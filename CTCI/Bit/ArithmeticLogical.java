class ArithmeticLogical
{
	static int arithmeticShift(int x,int count)
	{
		for (int i=0;i<count ;i++ ) {
			x >>= 1;
		}
		return x;
	}

	static int logicalShift(int x,int count)
	{
		for (int i=0;i<count ;i++ ) {
			x >>>= 1;
		}
		return x;	
	}

	public static void main(String[] args) {
		System.out.println(arithmeticShift(-93242,40));
		System.out.println(logicalShift(-93242,40));
	}
}