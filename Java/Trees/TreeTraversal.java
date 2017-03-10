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

class TreeTraversal
{
	Node root;

	public TreeTraversal()
	{
		root = null;
	}

	private static void printPreOrder(Node root)
	{
		if(root == null)
			return;
		else
		{
			System.out.println(root.data+" ");
			printPreOrder(root.left);
			printPreOrder(root.right);
		}
	}

	private static void printInOrder(Node root)
	{
		if(root == null)
			return;
		else
		{
			printInOrder(root.left);
			System.out.println(root.data+" ");
			printInOrder(root.right);
		}
	}

	private static void printPostOrder(Node root)
	{
		if(root == null)
			return;
		else
		{
			printPostOrder(root.left);
			printPostOrder(root.right);
			System.out.println(root.data+" ");
		}
	}

	private static int height(Node root)
	{
		if (root==null) 
			return 0;
		else
		{
			int lh = height(root.left);
			int rh = height(root.right);

			return (lh > rh) ? lh+1 : rh+1;
		}
	}

	private static void printCurrentLevel(Node root,int level)
	{
		if (root == null) return;
		else if(level == 1) System.out.println(root.data+" ");
		else if(level > 1)
		{
			printCurrentLevel(root.left,level-1);
			printCurrentLevel(root.right,level-1);
		}
	}

	private static void printLevelOrder(Node root)
	{
		if(root == null)
			return;
		int height = height(root);

		for (int level=1;level<=height ;level++ ) {
			printCurrentLevel(root,level);
		}
	}

	public static void main(String[] args) {
		TreeTraversal tree = new TreeTraversal();
		tree.root = new Node(1);
		tree.root.left =new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Pre Order");
		printPreOrder(tree.root);

		System.out.println("In Order");
		printInOrder(tree.root);

		System.out.println("Post Order");
		printPostOrder(tree.root);

		System.out.println("Level Order");
		printLevelOrder(tree.root);
	}
}