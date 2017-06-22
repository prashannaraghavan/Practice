class TwoSum
{
	static int[] find2Sum(int a[],int sum)
	{
		int i=0;
		int j=a.length-1;
		int[] returnarr = new int[2];
		while(i<j)
		{
			if (a[i]+a[j]>sum) j--;
			else if(a[i]+a[j]<sum) i++;
			else if(a[i]+a[j]==sum) 
			{
				returnarr[0] = a[i];
				returnarr[1] = a[j];
				break;
			}
		}
		return returnarr;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int[] elements = find2Sum(arr,5);

		System.out.print("Elements are : ");

		for(int element : elements)
			System.out.print(element+" ");

		System.out.println();
	}
}