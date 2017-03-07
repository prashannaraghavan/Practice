class Stack
{
	static class Node
	{
		String item;
		Node next;
	}

	private static Node first=null;

	public static boolean isEmpty()
	{
		return first==null;
	}

	public static void push(String item)
	{
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}

	public static String pop()
	{
		String item = first.item;
		first = first.next;
		return item;  
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
		push("This");
		push("Is");
		push("Insane");
		System.out.println(pop());
		readContents();
	}
}