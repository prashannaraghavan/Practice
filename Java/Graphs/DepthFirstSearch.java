import java.util.Stack;

class DepthFirstSearch
{
	private boolean[] marked;
	private int[] edgeTo;
	private int s;

	public DepthFirstSearch(Graph G,int s)
	{
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		this.s = s;
		dfs(G,s);
	}

	public void dfs(Graph G,int v)
	{
		marked[v] = true;

		for(int w:G.adj(v))
		{
			if(!marked[w])
			{
				edgeTo[w] = v;
				dfs(G,w);
			}
		}
	}

	public boolean hasPathTo(int v){ return marked[v]; }

	public Iterable<Integer> pathTo(int v)
	{
		if(!hasPathTo(v)) return null;

		Stack<Integer> path = new Stack<Integer>();

		for (int x=v;x!=s ;x=edgeTo[x] ) {
			path.push(x);
		}

		path.push(s);
		return path;
	}

	public static void main(String[] args) {
		Graph G = new Graph(new In(args[0]));
		DepthFirstSearch dfs = new DepthFirstSearch(G,0);
		// Iterator it = dfs.pathTo(5);
		for(int i:dfs.pathTo(5))
		{
			System.out.println(i+" ");
		}
	}
}