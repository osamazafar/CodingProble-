import java.util.ArrayList;

/*Given two sorted integer arrays A and B, merge B into A as one sorted array.

 Note: You have to modify the array A to contain the merge of A and B.
  Do not output anything in your code.
TIP: C users, please malloc the result into a new array and return the result. 
If the number of elements initialized in A and B are m and n respectively,
 the resulting size of array A after your code is executed should be m + n 
 */

public class MergeTwoSortedList {

	public void merge(ArrayList<Integer> A, ArrayList<Integer> B)
	{
		int i = 0;
		int j = 0;
		
		while(i < A.size() && j < B.size())
		{
			if(A.get(i) <= B.get(j))
			{
				i++;
			}
			else
			{
				A.add(i, B.get(j));
				j++;
			}
		}
		while(j < B.size())
		{
			A.add(i, B.get(j));
			j++;
		}
		System.out.println(A);
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(5);
		A.add(8);
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(6);
		B.add(9);	
		System.out.print(A);
		System.out.print(B);
		
	     MergeTwoSortedList ob1 = new MergeTwoSortedList();
		 ob1.merge(A, B);
	}
}
