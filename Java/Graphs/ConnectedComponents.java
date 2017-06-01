class ConnectedComponents
{
	private static boolean[] marked;
	private static int[] id;
	private static int count;

	public ConnectedComponents(Graph G)
	{
		marked = new boolean[G.V()];
		id = new int[G.V()];

		for (int s=0;s<G.V() ;s++ ) {
			if(!marked[s])
			{
				dfs(G,s);
				count++;
			}
		}
	}

	static void dfs(Graph G,int s)
	{
		marked[s] = true;
		id[s] = count;
		for(int w:G.adj(s))
		{
			if(!marked[w])
			{
				dfs(G,w);
			}
		}
	}

	static boolean connected(int s,int w)
	{
		return id[s] == id[w];
	}

	static int id(int v)
	{
		return id[v];
	}

	static int count()
	{
		return count;
	}

	public static void main(String[] args) {
		Graph G = new Graph(new In(args[0]));
		ConnectedComponents cc = new ConnectedComponents(G);
		// System.out.println(count());
		int count = count();
		Bag<Integer>[] bag = (Bag<Integer>[])new Bag[count];

		for (int i=0;i<count ;i++ ) {
			bag[i] = new Bag<Integer>();
		}

		for (int v=0;v<G.V() ;v++ ) {
			Bag<Integer> component = bag[cc.id(v)];
			component.addItem(v);
		}

		for (int j=0;j<count ;j++ ) {
			for(int w:bag[j])
				System.out.print(w + " ");
			System.out.println();
		}
	}
}