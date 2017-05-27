public class Graph
{
	private int V;
	private int E;
	private Bag<Integer>[] adj;

	public Graph(int V)
	{
		this.V = V;
		this.E = 0;

		adj = (Bag<Integer>[]) new Bag[V];
		for (int v=0;v<V ;v++ ) {
			adj[v] = new Bag<Integer>();
		}
	}

	public Graph(In in)
	{
		this(in.readInt());
		int E = in.readInt();

		for (int i=0;i<E ;i++ ) {
			int v = in.readInt();
			int w = in.readInt();
			addEdge(v,w);
		}
	}

	public int V(){ return V; }
	public int E(){ return E; }

	public void addEdge(int v,int w)
	{
		adj[v].addItem(w);
		adj[w].addItem(v);
		E++;
	}

	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}

	public String toString()
	{
		String s = V + " vertices, " + E + " edges\n";
		for (int v = 0; v < V; v++)
		{
			s += v + ": ";
			for (int w : this.adj(v))
			s += w + " ";
			s += "\n";
		}
		return s;
	}

	public static void main(String[] args) {
		 Graph graph = new Graph(new In(args[0]));
		 System.out.println(graph.toString()); 
	}
}