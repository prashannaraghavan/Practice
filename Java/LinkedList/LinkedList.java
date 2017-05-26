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

class LinkedList
{
	static Node head = null;
	static Node last = null;

	static int length = 0;

	static boolean isEmpty()
	{
		return head==null;
	}

	static void addFirst(int item)
	{
		Node node = new Node(item);
		if (isEmpty()) {
			head = node;
			last = node;
		}
		else{
			node.next = head;
			head = node;
		}
		length += 1;
	}

	static void addLast(int item)
	{
		Node node = new Node(item);
		if (isEmpty()) {
			head = node;
			last = node;
		}
		// else{
		// 	Node temp = head;
		// 	while(temp.next != null){ temp = temp.next; }
		// 	temp.next = node;
		// 	last = node;
		// }
		else{
			Node oldlast = last;
			oldlast.next = node;
			last = node;
		}
		length += 1;
	}

	static void addAt(int position,int data)
	{
		Node temp = head;
		Node prev = null;

		if (position == 1) {
			addFirst(data);
		}
		else if(position == length+1)
		{
			addLast(data);
		}
		else
		{
			int j=1;
			while(temp != null && j != position)
			{
				prev = temp;
				temp = temp.next;
				j += 1;
			}

			if (temp == null) {
				System.out.println("You kidding me. Where exactly are you trying to add");
				return;
			}
			else
			{
				Node node = new Node(data);
				prev.next = node;
				node.next = temp;
				length += 1;
			}
			
		}
	}

	static void display()
	{
		Node temp = head;
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	static void displayInReverse(Node tempHead)
	{
		if (tempHead == null) {
			System.out.println();
			return;
		}
		displayInReverse(tempHead.next);
		System.out.print(tempHead.data+" ");
	}

	static void displayInReverse()
	{
		Node temp = head;
		displayInReverse(temp);
	}

	static void remove(int item)
	{
		Node temp = head;
		Node prev = null;

		if (temp == null) {
			System.out.println("Come on man. Add something");
			return;
		}

		while(temp != null && temp.data != item)
		{
			prev = temp;
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("You kidding me. What are you trying to delete");
			return;
		}

		else
		{
			int removedItem = temp.data;
			if (temp.next == null) {
				prev.next = null;
				last = prev;
			}

			else
			{
				if (prev!=null) {
					prev.next = temp.next;	
				}
				else
				{
					head = temp.next;
				}
				
			}
			System.out.println(removedItem+" kaka oosh");
			length -= 1;
		}
	}

	static int sizeofLL()
	{
		return length;
	}
   
    static Node last(){
    	return last;
    }

    static Node first(){
    	return head;
    }


	public static void main(String[] args) {
		addLast(5);
		addLast(4);
		addLast(6);
		addFirst(8);
		addLast(1);
		addFirst(2);
		display();
		System.out.println("Size : "+sizeofLL());
		System.out.println("First : "+first().data);
		System.out.println("Last : "+last().data);
		System.out.println();

		remove(1);
		display();
		System.out.println("Size : "+sizeofLL());
		System.out.println("First : "+first().data);
		System.out.println("Last : "+last().data);
		System.out.println();

		addAt(6,2);
		display();

		System.out.println("Size : "+sizeofLL());
		System.out.println("First : "+first().data);
		System.out.println("Last : "+last().data);
		System.out.println();

		displayInReverse();
	} 
}