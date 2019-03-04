import java.util.ArrayList;
import java.util.Arrays;

/*Given an array S of n integers,
 *  are there elements a, b, c in S such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
Note:
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
The solution set must not contain duplicate triplets. For example, given 
array S = {-1 0 1 2 -1 -4}, A solution set is:
			(-1, 0, 1)
			(-1, -1, 2) 
			
			*/
public class sum3Zero {

	
	public ArrayList<ArrayList<Integer>> ThreesumsZero(int [] a)
	{
		Arrays.sort(a);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int n = a.length;
		for(int i =0; i < n-2; i++)
		{
			int j = i+1;
			int k = n-1;
			while(j < k)
			{
				int sum = a[i] + a[j] + a[k];
				
				if(sum == 0)
				{
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(a[i]);
					temp.add(a[j]);
					temp.add(a[k]);
					if(!result.contains(temp))
						result.add(temp);
				}
				if(sum < 0)
					j++;
				else
					k--;
				
				
			}
		}
		
		return result;
	}
	
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] a = new int [] {-1, 0, 1, 2, -1, -4};
		sum3Zero ob1 = new sum3Zero();
		System.out.println(ob1.ThreesumsZero(a));
	}
}
