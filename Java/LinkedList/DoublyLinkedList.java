class Node
{
	int data;
	Node prev;
	Node next;

	public Node(int item)
	{
		data = item;
		prev = null;
		next = null;
	}
}

class DoublyLinkedList
{
	static Node head = null;
	static Node last = null;
	static int length = 0;

	static boolean isEmpty()
	{
		return head == null;
	}

	static int length()
	{
		return length;
	}

	static void addLast(int data)
	{
		Node node = new Node(data);
		if(isEmpty()){ 
			head = node ;
			last = node ;
		}
		else
		{
			Node oldlast = last;
			last.next = node;
			node.prev = last;
			last = node;
		}
		length += 1;
	}

	static void addFirst(int data)
	{
		Node node = new Node(data);
		if(isEmpty()){ 
			head = node ;
			last = node ;
		}
		else
		{
			Node oldfirst = head;
			node.next = oldfirst;
			oldfirst.prev = node;
			head = node;
		}
		length += 1;
	}

	static void insert(Node temp,int data)
	{
		Node prev = temp.prev;
		Node next = temp;
		Node newNode = new Node(data);
		prev.next = newNode;
		newNode.next = next;
		newNode.prev = prev;
		next.prev = newNode;
		length += 1;
	}

	static void delete(Node temp)
	{
		Node prev = temp.prev;
		Node next = temp.next;
	
		prev.next = next;
		next.prev = prev;

		length -= 1;
	}

	static void nearestEnd(int operation,int position,int data)
	{
		int pos = 1;
		int posFromLast = length;

		if(length-position <= length/2)
		{
			Node temp = last;
			while(last!=null && posFromLast!=position)
			{
				temp = temp.prev;
				posFromLast -= 1;
			}

			if (temp==null) {
				System.out.println("Cant Insert");
				return;
			}
			else
			{
				if(operation == 0)
					insert(temp,data);
				else
					delete(temp);
			}
		}

		else
		{
			Node temp = head;
			while(temp!=null && pos!=position)
			{
				temp = temp.next;
				pos += 1;
			}

			if (temp==null) {
				System.out.println("Cant Insert");
				return;
			}
			else
			{
				if(operation == 0)
					insert(temp,data);
				else
					delete(temp);
			}
		}
	}

	static void addAt(int position,int data)
	{
		if (position == 1) {
			addFirst(data);
		}

		else if (position == length+1) {
			addLast(data);
		}

		else
		{
			nearestEnd(0,position,data);
		}
	}

	static void removeAt(int position)
	{
		Node first = head;
		Node tail = last;

		if(position == 1)
		{
			Node next = first.next;
			next.prev = null;
			first = next;
			head = first;
			length -= 1;
			return;
		}
		else if(position == length)
		{
			Node prev = tail.prev;
			prev.next = null;
			tail = prev;
			last = tail;
			length -= 1;
			return;
		}

		else
		{
			nearestEnd(1,position,0);
		}
	}

	static void display(Node last)
	{
		Node tempLast = last;
		if(tempLast.prev == null){
			System.out.print(tempLast.data+" ");
			return;
		}
		display(tempLast.prev);
		System.out.print(tempLast.data+" ");
	}

	static void displayInReverse(Node first)
	{
		Node tempFirst = first;
		if(tempFirst.next == null){
			System.out.print(tempFirst.data+" ");
			return;
		}
		displayInReverse(tempFirst.next);
		System.out.print(tempFirst.data+" ");
	}

	static  void displayInOrder()
	{
		display(last);
		System.out.println();
	}

	static  void displayInReverse()
	{
		displayInReverse(head);
		System.out.println();
	}

	static void removeLast()
	{
		removeAt(length);
		displayInOrder();
	}

	static void removeHead()
	{
		removeAt(1);
		displayInOrder();
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

		addAt(6,7);
		displayInOrder();

		removeHead();
		removeLast();

		removeAt(2);
		displayInOrder();
	}
}