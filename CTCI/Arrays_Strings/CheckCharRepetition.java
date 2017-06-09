class CheckCharRepetition
{
	static boolean checkCharForRepetition(String str)
	{
		boolean[] setFlag = new boolean[128];
		int n = str.length();

		for (int i=0;i<n ;i++ ) {

			int val = str.charAt(i);

			if (setFlag[val]) 
				return true;
			
			setFlag[val] = true;
		}

		return false;
	}

	static boolean checkCharRepetition(String str)
	{
		int flag = 0;
		int n = str.length();

		for (int i=0;i<n ;i++ ) {

			int val = str.charAt(i) - 'a';
			// System.out.println(val+" "+(1 << val));
			if ((flag & (1 << val)) > 0) 
				return true;
			
			flag |= (1 << val);
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkCharRepetition("madam") ? "Yes" : "No");
	}
}