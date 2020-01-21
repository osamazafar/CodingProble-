package HashMap;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KthFrequentElement
{
	
	public static ArrayList<Integer> topKFrequent(int [] arr, int k)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : arr)
		{
			if(map.containsKey(i))
				  map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
		
		System.out.println(map);
		for(Map.Entry<Integer, Integer> e : map.entrySet())
		{
			System.out.println(e.getValue());
			
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(Map.Entry<Integer, Integer> e : map.entrySet())
		{
			if(pq.size() < k)
			{
				pq.offer(e.getValue());
			}
			else
				pq.poll();
	
		}
		System.out.println(pq);
	
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException
	{	
		int arr [] = new int [] {1,3,2,6,1,6,2,6,7,7,7,7,8,8,8,8,8};
		int k = 2;
		System.out.println(KthFrequentElement.topKFrequent(arr, k));
	}
		
}
