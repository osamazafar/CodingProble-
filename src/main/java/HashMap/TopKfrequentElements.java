package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


public class TopKfrequentElements
{

	
	public static ArrayList<Integer> topKFrequent(int [] nums, int k)
	{
		int j = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : nums)
			map.put(i, map.getOrDefault(i,0)+1);
		
		
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)-> (b.getValue() - a.getValue()));
		for(Map.Entry<Integer, Integer> e: map.entrySet())
			pq.add(e);
		System.out.println(pq);
		
		while(j < k)
		{
			Map.Entry<Integer, Integer> e  = pq.poll();
			result.add(e.getKey());
			j++;
		}
		return result;
	}
	
	
	public static List<Integer> topk(int [] nums, int k)
	{
		List<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i : nums)
		{
			map.put(i, map.getOrDefault(i,0)+1);
		}
		
		@SuppressWarnings("unchecked")
		List<Integer>[] bucket = new List[nums.length+1];
		
		for(Map.Entry<Integer, Integer> e: map.entrySet()) 
		{
			final int n = e.getKey();
			final int c = e.getValue();
			if(bucket[c] == null)
			{
				bucket[c] = new ArrayList<Integer>();
			}
			bucket[c].add(n);
		}
		
		for(int i = 0; i < bucket.length; i++)
		{
			System.out.println(bucket[i]);
		} 
		
		for(int i = bucket.length-1; i>=0; --i)
		{
			if(bucket[i] != null)
			{
				result.addAll(bucket[i]);
			}
			if(result.size() >= k)
				break;
		}
		return result;
	}
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] nums = new int [] {1,1,2,2,4,5,4,4};
		int k = 2;
		System.out.println(TopKfrequentElements.topKFrequent(nums, k));
		System.out.println(TopKfrequentElements.topk(nums, k));
	}
	
}
