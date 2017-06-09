class GetSetBits
{
	static boolean getBit(int x,int i)
	{
		return ((x & (1 << i)) != 0);
	}

	static int setBit(int x,int i)
	{
		return (x | (1 << i));
	}

	static int clearBit(int x,int i)
	{
		return (x & ~(1 << i));
	}

	static int clearBitthroMSB(int x,int i)
	{
		return (x & ((1 << i) - 1));
	}

	static int clearBitthroZero(int x,int i)
	{
		return (x & (-1 << (i+1)));
	}

	static int updateBit(int x,int i,boolean b)
	{ 
		int val = b ? 1 : 0;
		return (x & ~(1 << i)) | (val << i);
	}	

	public static void main(String[] args) {
		System.out.println(getBit(7,0));
		System.out.println(setBit(7,3));
		System.out.println(clearBit(7,2));
		System.out.println(clearBitthroMSB(7,2));
		System.out.println(clearBitthroZero(7,1));
		System.out.println(updateBit(7,3,true));
	}
}