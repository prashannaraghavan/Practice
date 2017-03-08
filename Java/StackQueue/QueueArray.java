class QueueArray
{
	private static String[] s;
	private static int N=0;
	private static int head=0,tail=0;

	public QueueArray(int size)
	{
		s = new String[size];
	}

	public static boolean isEmpty()
	{
		return N==0;
	}

	public static void enqueue(String item)
	{
		s[tail++] = item;
		if (tail == s.length) tail=0;
		N++;
	}

	public static String dequeue()
	{
		String item = s[head];
		s[head] = null;
		N--;
		head++;
		return item;
	}

	public static void readContents()
	{
		for (int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
	}

	public static void main(String[] args) {
		QueueArray queue = new QueueArray(10);
		enqueue("This");
		enqueue("Is");

		System.out.println(dequeue());
		enqueue("Insane");
		System.out.println(dequeue());
		System.out.println(dequeue());
		enqueue("This");
		enqueue("Is");
		readContents();
	}
}