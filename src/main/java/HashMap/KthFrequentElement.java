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
		
		for(Map.Entry<Integer, Integer> e : map.entrySet())
		{
			System.out.println(e.getValue());
			
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(Map.Entry<Integer, Integer> e : map.entrySet())
		{
			pq.offer(e.getValue());
		}
		
	
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException
	{	
		int arr [] = new int [] {1,1,3,2,6,1,6,2,6};
		int k = 2;
		System.out.println(KthFrequentElement.topKFrequent(arr, k));
	}
		
}
