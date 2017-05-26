class Rotation
{
	static int gcd(int a,int b)
	{
		if(b==0) return a;
		else return gcd(b,a%b);
	}

	/*
		5,2,4,8,6,3,1

	*/
	static void rotate(int arr[],int d)
	{
		int n = arr.length;	
		int gcd = gcd(d,n);
		int j,k,temp;

		for (int i=0;i<gcd ;i++ ) {
			temp = arr[i];
			j=i;
			while(true)
			{
				k=j+d;
				if(k >= n) k=k-n;
				if(k == i) break;
				arr[j] = arr[k];
				j=k;
			}

			arr[j] = temp;
		}
	}

	static void print(int arr[])
	{
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {5,2,4,8,6,3,1};
		print(arr);
		rotate(arr,2);
		print(arr);
	}
}