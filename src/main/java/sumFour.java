import java.util.ArrayList;
import java.util.Arrays;


public class sumFour {

	
	public ArrayList<ArrayList<Integer>> fourSum(int [] a, int target)
	{
		int n = a.length;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		//HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		Arrays.sort(a);
		for(int i = 0; i < n-3; i++)
		{
			for(int j = i+1; j < n-2; j++)
			{
				int l = j+1;
				int m = n-1;
				while(l < m)
				{
					int sum = a[i] + a[j] + a[l] +a[m];
					if(sum < target)
						l++;
					else if(sum > target)
						m--;
				
					else if(sum == target)
					{
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(a[i]);
						temp.add(a[j]);
						temp.add(a[l]);
						temp.add(a[m]);
						if(!result.contains(temp))
						{
							//set.add(temp);
							result.add(temp);
						}
						l++;
						m--;
					}
				}
					
			}
		}
		return result;
	}
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] a = new int [] {1, 0, -1, 0, -2, 2};
		int target = 0;
		sumFour ob1 = new sumFour();
		System.out.println(ob1.fourSum(a, target));
	}
}
