class StackArray
{
	private static String[] s;
	private static int N=0;

	public StackArray(int size)
	{
		s = new String[size];
	}

	public static boolean isEmpty()
	{
		return N==0;
	}

	public static void push(String item)
	{
		s[N++] = item;
	}

	public static String pop()
	{
		String item = s[--N];
		// s[N] = null;
		return item;
	}

	public static void readContents()
	{
		for (int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
	}

	public static void main(String[] args) {
		StackArray stack = new StackArray(10);
		push("This");
		push("Is");
		
		System.out.println(pop());
		push("Insane");
		System.out.println(pop());
		readContents();
	}
}