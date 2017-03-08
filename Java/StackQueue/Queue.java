class Queue
{
	private static class Node
	{
		String item;
		Node next;
	}

	private static Node first = null,last = null;

	public static void enqueue(String item)
	{
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) first = last;
		else oldlast.next = last;
	}

	public static String dequeue()
	{
		String item = first.item;
		first = first.next;
		if (isEmpty()) last = null;
		return item;
	}

	public static boolean isEmpty()
	{
		return first == null;
	}

	public static void readContents()
	{
		Node node = first;
		while(!isEmpty() && node!=null)
		{
			System.out.print(node.item+" ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		enqueue("This");
		enqueue("Is");
		enqueue("Insane");
		System.out.println(dequeue());
		readContents();
	}
}