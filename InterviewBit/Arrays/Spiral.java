public class Spiral {
	// DO NOT MODIFY THE LIST
	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 // Populate result;
		 int i=0;
		 for(Arraylist list:a)
		 {
		     if(i==0){
		        System.out.println(list); 
		     }
		     
		     else if(i==a.size()-1)
		     {
		        System.out.println(list);
		     }
		     
		     i++;
		 }
		 return result;
	}

	public static void main(String[] args) {
		List<ArrayList<Integer>> list = new List<ArrayList<Integer>>();

		int i=0;

		for (int i=0;i<3 ;i++ ) {
			ArrayList<Integer> a = new ArrayList<Integer>();

			for (int j=0;j<3 ;j++ ) {
				{
					a.add(++i);
				}

				list.add(a);
			}
		
		}

		Arraylist<Integer> b = spiralOrder(list);
	}
}
