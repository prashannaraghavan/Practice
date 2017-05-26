class AppearOnce
{
	private static int appearOnce(int arr[],int n)
	{
		int ones =0,twos = 0;
		int common = 0;

		for(int i=0;i<n;i++)
		{
			twos = twos | (ones & arr[i]);
			ones = ones ^ arr[i];
			common = ~(ones & twos);
			ones &= common;
			twos &= common;
		}

		return ones;
	}

	private static int appearOnce1(int arr[],int n)
	{
		int x,sum,result=0;
		for(int i=0;i<32;i++)
		{
			sum=0;
			x = (1<<i);

			for(int j=0;j<n;j++)
			{

				if((arr[j] & x) ==1)
					sum += 1;

				System.out.println(arr[j]+" "+x+" "+sum);
			}


			if((sum%3)==1)
				result |= x;

			
		}

		return result;
	} 

	public static void main(String[] args) {
		int arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7};
		int n = arr.length;
		System.out.println(appearOnce1(arr,n));
	}
}