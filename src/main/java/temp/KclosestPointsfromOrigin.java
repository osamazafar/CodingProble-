package temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class KclosestPointsfromOrigin
{
	
	public static ArrayList<ArrayList<Integer>> closestpoints(ArrayList<ArrayList<Integer>> nums, int k)
	{
		HashMap<ArrayList<Integer>, Integer> map = new HashMap<ArrayList<Integer>, Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < nums.size(); i++)
		{
			ArrayList<Integer> temp = nums.get(i);
//			System.out.println(distance(temp));
			int dist = (int) distance(temp);
			map.put(temp, dist);
		}
		System.out.println(map);
//		ArrayList<Integer> disval = new ArrayList<Integer>();
//		disval.addAll(map.values());
//		Collections.sort(disval);
		
//		for(int i = 0; i < k; i++)
//		{
//		for(Map.Entry<ArrayList<Integer>, Integer> e: map.entrySet())
//		{
//			if(disval.get(i) == e.getValue())
//			{
//				result.add(e.getKey());
//			}
//			
//		}
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for(int i : map.values())
			{
				//pq.offer(i);
				pq.add(i);
				if(pq.size() > k)
				{
					pq.poll();
		
				}			
			}
			System.out.println(pq);
			for(Map.Entry<ArrayList<Integer>, Integer> e : map.entrySet())
			{
				if(pq.contains(e.getValue()))
					continue;
				else
				{
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.addAll(e.getKey());
					result.add(temp);
				}
			}
					
			
		
		
		return result;
	}
	
	public static double distance(ArrayList<Integer> cord)
	{
		int val1 = cord.get(0);
		int val2 = cord.get(1);
		return Math.sqrt((0-val1)*(0-val1)  + (0-val2)*(0-val2));
	}

	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer>>();
		int [] n = new int [] {-16,5,-1,2,4,3,10,-2,0,3,-5,-9};
		for(int i = 0; i < n.length-1; i=i+2)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(n[i]);
			temp.add(n[i+1]);
			nums.add(temp);
		}
//		System.out.println(nums);
		int k = 3;
		
		
		System.out.println(KclosestPointsfromOrigin.closestpoints(nums, k));
	}

}
