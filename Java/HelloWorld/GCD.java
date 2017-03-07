import java.util.Scanner;

class GCD
{
	public static int gcd(int a,int b)
	{
		if (b==0) 
			return a;
		else
			return gcd(b,a%b);
	}

	public static int lcm(int a,int b)
	{
		return a/gcd(a,b)*b;
	}

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("GCD : "+gcd(a,b));
		System.out.println("LCM : "+lcm(a,b));
	}
}