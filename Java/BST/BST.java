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
	private static Node suc;
	private static Node pre;

	public BST()
	{
		root = null;
		suc = null;
		pre = null;
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

		else if (root.key < item) {
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

	private static int min(Node root)
	{
		while(root.left != null)
		{
			root = root.left;
		}

		return root.left.key;
	}

	private static void delete(int key)
	{
		root = deleteKey(root,key);
	}

	private static Node deleteKey(Node root,int key)
	{
		if (root == null) {
			return root;
		}

		if (root.key > key) {
			root.left = deleteKey(root.left,key);
		}

		else if (root.key < key) {
			root.right = deleteKey(root.right,key);
		}

		else
		{
			if (root.left == null) {
				return root.right;
			}

			else if (root.right == null) {
				return root.left;
			}

			root.key = min(root.right);
			root.right = deleteKey(root.right,key);
		}

		return root;
	}

	private static void findSucAndPre(int key)
	{
		findInOrderSucAndPre(root,key);
	}

	private static void findInOrderSucAndPre(Node root, int key)
	{
		if (root == null) 
			return;

		else 
		{
			if(root.key == key)
			{
				if (root.left != null) {
					Node temp = root;
					while(temp.right != null)
					{
						temp =temp.right;
					}
					pre = temp;
				}

				if (root.right != null) {
					Node temp = root;
					while(temp.left != null)
					{
						temp =temp.left;
					}
					suc = temp;
				}
			}

			else if(root.key > key)
			{
				suc = root;
				findInOrderSucAndPre(root.left,key);
			}

			else if(root.key < key)
			{
				pre = root;
				findInOrderSucAndPre(root.right,key);
			}
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

		int key = 60;

		findSucAndPre(key);
		System.out.println((pre != null) ? "Predecessor : "+  pre.key : "Predecessor : Not found");
		System.out.println((suc != null) ? "Successor : "+ suc.key : "Successor : Not found");

		delete(60);

		tree.inorder();

		findSucAndPre(key);
		System.out.println((pre != null) ? "Predecessor : "+  pre.key : "Predecessor : Not found");
		System.out.println((suc != null) ? "Successor : "+ suc.key : "Successor : Not found");

	}
}