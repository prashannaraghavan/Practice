import java.util.Iterator;

class Bag<Item> implements Iterable<Item>
{
	private Node first;

	private class Node
	{	
		Item item;
		Node next;

		public Node(Item data)
		{
			item = data;
			next = null;
		}
	}

	public void addItem(Item item)
	{
		Node oldfirst = first;
		Node node = new Node(item);
		node.next = oldfirst;
		first = node;
	}

	public Iterator<Item> iterator()
	{
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Item>
	{
		private Node current = first;

		public boolean hasNext() { return current != null; }

		public void remove(){ }

		public Item next()
		{
			Item item = current.item;
			current = current.next;
			return item;
		}
	}

	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.addItem(5);
		bag.addItem(4);
		bag.addItem(2);
		bag.addItem(3);
		bag.addItem(1);

		Iterator iterator = bag.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next()+" ");
		}
	}
}