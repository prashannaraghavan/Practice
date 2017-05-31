class Fibonacci
{
	static int fib[];

	public Fibonacci(int n)
	{
		fib = new int[n];
		fibonacci(n);
	}

	static void fibonacci(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(i<2) 
				fib[i] = i;
			else
				fib[i] = fib[i-1] + fib[i-2];
		}
	}

	static void display()
	{
		for(int i:fib)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci(20);
		display();
	}	
}