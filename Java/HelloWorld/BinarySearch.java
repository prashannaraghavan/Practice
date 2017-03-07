class BinarySearch
{
	public static boolean bs(int[] arr,int lo,int hi,int b)
	{
		int mid = (lo+hi)/2;
		if (lo==hi) return false;
		else if (arr[mid] == b) return true;
		else if (arr[mid] < b) return bs(arr,mid+1,hi,b);
		else if (arr[mid] > b) return bs(arr,lo,mid-1,b);
		else return false;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};

		int lo=0;
		int hi=arr.length-1;

		String result = bs(arr,lo,hi,10) ? "Yes" : "No";
		System.out.println("Found : "+result);
	}
}