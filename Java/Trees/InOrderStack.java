import java.util.Stack;

class Node
{
	int data;
	Node left,right;

	public Node(int item)
	{
		data = item;
		left = null;
		right =null;
	}
}

class InOrderStack
{
	static Node root;

	public InOrderStack()
	{
		root = null;
	}

	private static void printInOrder(Node rootNode)
	{
		root = rootNode;

		if (root == null) 
			return;

		else
		{
			Stack<Node> stack = new Stack<Node>();

			while(root != null)
			{
				stack.push(root);
				root = root.left;
			}

			while (stack.size() > 0) {
				Node current = stack.pop();
				System.out.println(current.data+" ");

				if (current.right != null) {
					current = current.right;

					while(current != null)
					{
						stack.push(current);
						current = current.left;
					}
				}
			}
		}
	}

	private static void printPreOrder(Node rootNode)
	{
		root = rootNode;

		if (root == null) 
		{
			return;
		}

		else
		{

			Stack<Node> stack = new Stack<Node>();

			if(root != null)
			{
				stack.push(root);
			}

			while (stack.size() > 0) {
				Node current = stack.pop();
				System.out.println(current.data+" ");

				if (current.right != null) {
					stack.push(current.right);
				}

				if (current.left != null) {
					stack.push(current.left);
				}

			}
		}
	}

	private static void printPostOrder(Node rootNode)
	{
		root = rootNode;

		if (root == null) 
		{
			return;
		}

		else
		{

			Stack<Node> stack = new Stack<Node>();

			if(root != null)
			{
				stack.push(root);
			}

			Node prev = null;

			while (stack.size() > 0) {

				Node current = stack.peek();
				
				if(prev == null || prev.left == current || prev.right == current)
				{
					if (current.left != null) {
						stack.push(current.left);
					}

					else if (current.right != null) {
						stack.push(current.right);
					}
				}

				else if(current.left == prev)
				{
					if (current.right != null) {
						stack.push(current.right);
					}
				}

				else
				{
					System.out.println(current.data+" ");
					stack.pop();
				}	
				
				prev = current;	
			}
		}
	}

	public static void main(String[] args) {
		InOrderStack tree = new InOrderStack();
		tree.root = new Node(1);
		tree.root.left =new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Post Order");
		printPostOrder(tree.root);

		System.out.println("Pre Order");
		printPreOrder(tree.root);

		System.out.println("In Order");
		printInOrder(tree.root);

		
	}
}