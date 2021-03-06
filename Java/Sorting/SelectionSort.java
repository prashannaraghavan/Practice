import java.util.Comparator;

class SelectionSort
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
		int n = arr.length;
		for (int i=0;i<n-1 ;i++ ) {
			int min = i;
			for (int j=i+1;j<n ; j++) {
				if (less(arr[j],arr[min])) {
					min = j;
				}
			}

			exchange(arr,i,min);
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