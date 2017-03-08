class MergeSort
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

	private static void merge(Comparable arr[],Comparable aux[],int lo,int mid,int hi)
	{
		for(int k=lo;k<=hi;k++)
			aux[k] = arr[k];

		int i=lo,j=mid+1;

		for(int k=lo;k<=hi;k++)
		{
			if(i>mid) 				arr[k]=aux[j++];
			else if(j>hi) 			arr[k]=aux[i++];
			else if(less(aux[j],aux[i])) arr[k]=aux[j++];
			else 					arr[k]=aux[i++];
		}
	}

	private static void sort(Comparable arr[],Comparable aux[],int lo,int hi)
	{	
		if (hi<=lo) return;
		int mid = lo+((hi-lo)/2);
		sort(arr,aux,lo,mid);
		sort(arr,aux,mid+1,hi);
		merge(arr,aux,lo,mid,hi);
	}

	private static void sort(Comparable arr[])
	{	
		Comparable[] aux = new Comparable[arr.length];
		sort(arr,aux,0,arr.length-1);
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
		sort(arr);
		show(arr);
	}
}