class Pascal
{
	static void pascalTriangle(int n)
	{
		for (int line=1;line<=n ;line++ ) {
			int coefficient = 1;
			for (int i=1;i<=line ;i++ ) {
				System.out.print(coefficient+" ");
				coefficient = coefficient * (line-i)/i;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pascalTriangle(5);
	}	
}			