class Palindrome
{
	static String palindromeCheck(String s)
	{
		s = s.toLowerCase();
		char[] array = s.toCharArray();
		int n = s.length();

		boolean pal = true;

		for(int i=0;i<n/2;i++)
		{
			if (array[i] != array[n-i-1]) {
				pal = false;
				break;
			}
		}

		return (pal==true) ? "Yes" : "No";
	}

	public static void main(String[] args) {
		String s="Malayalam";
		System.out.println("Is "+s+" a palindrome string?\n"+"The program says "+palindromeCheck(s));
	}
}