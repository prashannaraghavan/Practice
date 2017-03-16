class Node
{
	int key;
	Node left,right;

	public Node(int item)
	{
		key = item;
		left = null;
		right =null;
	}
}

class BST
{
	private static Node root;

	public BST()
	{
		root = null;
	}

	private static void insert(int item)
	{
		root = insertRec(root,item);
	}

	private static Node insertRec(Node root,int item){
		if (root == null) {
			root = new Node(item);
		}

		if (root.key > item) {
			root.left = insertRec(root.left,item);
		}

		if (root.key < item) {
			root.right = insertRec(root.right,item);
		}

		return root;
	}

	private static void inorder()
	{
		inOrderTrav(root);
	}

	private static void inOrderTrav(Node root)
	{
		if (root == null) 
		{
			return;
		}
		
		else
		{
			inOrderTrav(root.left);
			System.out.println(root.key+" ");
			inOrderTrav(root.right);
		}
	}

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

		tree.inorder();
	}
}