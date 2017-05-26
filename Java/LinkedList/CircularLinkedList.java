class Node
{
	int data;
	Node next;

	public Node(int item)
	{
		data = item;
		next = null;
	}
}

class CircularLinkedList
{
	static Node head = null;
	static Node tail = null;
	static int length = 0;

	static boolean isEmpty()
	{
		return head == null;
	}

	static void addAt(int pos,int item)
	{
		if(pos==1)
		{
			addFirst(item);
		}

		else if(pos==length+1)
		{
			addLast(item);
		}

		else
		{
			Node first = head;
			Node prev = null;
			Node node = new Node(item);

			int j=1;

			while(j!=pos)
			{
				prev = first;
				first = first.next;
				j += 1;
			}

			node.next = first;
			prev.next = node;
			length += 1;
		}
	}

	static void addFirst(int item)
	{
		Node node = new Node(item);
		Node first = head;

		if(isEmpty()){
			node.next = node;
			first = node;
			tail = node;
			head = first;
		}

		else
		{
			tail.next = node;
			node.next = first;
			first = node;
			head = first;
		}

		length += 1;
	}

	static void addLast(int item)
	{
		Node node = new Node(item);
		Node first = head;

		if(isEmpty()){
			node.next = node;
			first = node;
			tail = node;
			head = first;
		}

		else
		{
			node.next = first;
			tail.next = node;
			tail = node;
		}

		length += 1;
	}

	static void displayInOrder()
	{
		if(isEmpty()){
			System.out.println("No data to display");
		}

		else
		{
			Node first = head;
			int j=0;

			while(j<length)
			{
				System.out.print(first.data+" ");
				first = first.next;
				j += 1;
			}
		}

		System.out.println();
	}

	static void displayInReverse(int pos,Node head)
	{
		if(isEmpty()){
			System.out.println("No data to display");
		}

		else
		{
			if(pos==length)
				return;
			else
			{
				displayInReverse(pos+1,head.next);
				System.out.print(head.data+" ");
			}
		}
	}

	static void displayInReverse()
	{
		int pos = 0;
		displayInReverse(pos,head);
		System.out.println();
	}

	static void removeFirst()
	{
		Node last = tail;
		Node first = head;

		tail.next = first.next;
		first = first.next;
		head = first;
		length -= 1;
	}

	static void removeLast()
	{
		Node last = tail;
		Node prev = head;
		int j=1;

		while(j<length)
		{
			prev = prev.next;
			j += 1;
		}

		prev.next = tail.next;
		tail = prev;
		length -= 1;
	}

	static void removeAt(int pos)
	{
		if(pos==1)
			removeFirst();
		else if(pos==length)
			removeLast();
		else
		{
			Node first = head;
			Node prev = head;

			int j=1;

			while(j<pos)
			{
				prev = first;
				first = first.next;
				j += 1;
			}

			prev.next = first.next;
			length -= 1;
		}
	}

	public static void main(String[] args) {
		addLast(5);
		addLast(4);
		addLast(6);
		addFirst(8);
		addLast(1);
		addFirst(2);
		displayInOrder();
		displayInReverse();
		addAt(6,9);
		displayInOrder();
		removeFirst();
		removeLast();
		removeAt(4);
		displayInOrder();
	}
}