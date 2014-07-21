import java.util.ArrayList;

public class quicksort{

	public static final int[] eles = {3, 7, 2, 1, 5, 9, 5};//many repeated elements can seriously hurt the performance of quicksort
	
	public static void main(String[] args){
		
		ArrayList<Integer> eleList = new ArrayList(Arrays.asList(eles));
		qsort(eleList);
	
		System.out.println("Hello World");
	}
	
	public static void qsort(ArrayList<Integer> sList){
		int pivot = (sList.length-1)/2; //many different, some better ways to choose pivot.
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		
		for (int i : sList){
			if (i < pivot){left.add(i);}else{right.add(i);}
		}
		
		qsort(left);
		qsort(right);
		
	}
	
	

}