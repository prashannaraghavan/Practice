class ShellSort
{
	private static boolean less(Comparable a,Comparable b)
	{
		return a.compareTo(b) < 0;
	}
	private static void exchange(Comparable a[],int i,int j)
	{
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static Comparable[] sort(Comparable arr[])
	{
		int N = arr.length;
		int h=1;

		while(h<N/3) h=3*h+1;

		while(h >= 1)
		{
			for (int i=h;i<N ;i++ ) {
				for (int j=i; j>=h && less(arr[j],arr[j-h]);j -=h ) {
					exchange(arr,j,j-h);
				}
			}
			
			h /= 3;
		}

		return arr;
	}

	private static void show(Comparable arr[])
	{
		for (int i=0;i<arr.length;i++ ) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Comparable arr[] = {5,3,6,1,2,9};
		arr=sort(arr);
		show(arr);
	}
}