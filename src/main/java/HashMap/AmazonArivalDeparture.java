package HashMap;

import java.util.HashMap;

public class AmazonArivalDeparture
{
	
	public static int arrivaldep(int [] arr, int [] dep)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		int maxVal = 0;
		for(int i = 0; i < arr.length; i++)
		{
			int a = arr[i];
			int d = dep[i];
			for(int j = a; j < d; j++)
			{
				if(map.containsKey(j))
				{
					map.put(j, map.get(j)+1);
				}
				else
					map.put(j, 1);
			}
			
			
		}
		
		for (int n : map.values()) {
		    maxVal = Math.max(maxVal, n);
		    
		}
		return maxVal;
	}

	
	public static void main(String [] args) throws InterruptedException
	{
		int [] arrival = new int [] {570, 675,990};
		int [] departure = new int [] {705, 690,1005};
		
		System.out.println(AmazonArivalDeparture.arrivaldep(arrival, departure));
		
		
	}
}
