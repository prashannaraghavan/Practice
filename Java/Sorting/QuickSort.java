class QuickSort
{
	private static void exchange(Comparable arr[],int i,int j)
	{
		Comparable temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static boolean less(Comparable a,Comparable b)
	{
		return a.compareTo(b) < 0;
	}

	private static int partition(Comparable a[],int lo,int hi)
	{
		int i=lo,j=hi+1;

		while(true)
		{
			while(less(a[++i],a[lo]))
				if(hi==i) break;

			while(less(a[lo],a[--j]))
				if(lo==j) break;

			if(i >= j) break;

			exchange(a,i,j);
		}

		exchange(a,lo,j);
		return j;
	}	

	private static void sort(Comparable a[],int lo,int hi)
	{
		if (hi <= lo) return; 
		int mid = partition(a,lo,hi);
		sort(a,lo,mid-1);
		sort(a,mid+1,hi);
	}

	private static void sort(Comparable a[])
	{
		// StdRandom.shuffle(a);
		sort(a,0,a.length-1);
	}

	private static void show(Comparable a[])
	{
		for (int i=0;i<a.length ; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Comparable arr[] = {4,7,3,1,6,5,2};
		sort(arr);
		show(arr);
	}
}