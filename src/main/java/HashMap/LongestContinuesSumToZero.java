package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestContinuesSumToZero
{

	
	
	public static ArrayList<Integer> longest(int [] a)
	{
		ArrayList<Integer> result = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int start= 0, end = 0;
		int sum = 0;
		map.put(0, -1);
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i];
			if(map.containsKey(sum))
			{
				int currstart = map.get(sum);
				int currend = i;
				if(currend - currstart + 1 > end - start +1)
				{
					start = currstart;
					end = currend;
				}
			}
			else
				map.put(sum, i);
			
		}
		
		for(int i = start+1; i<=end; i++)
			result.add(a[i]);
		return result;
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] a = new int []  {7,1,2,4,-4,-2};
		System.out.println(LongestContinuesSumToZero.longest(a));
	}
}
