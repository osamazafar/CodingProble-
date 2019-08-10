
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmazonsumClosest
{
	static int i= 0;
	static HashMap<List<Integer>, Integer>  map = new HashMap<>();
	public static List<List<Integer>>  test(List<List<Integer>>  forwardRouteList, List<List<Integer>>  returnRouteList, int maxTravelDist )
	{
		List<List<Integer>>  result = new ArrayList<>();
	
		int min = Integer.MAX_VALUE;
		for(i = 0; i < forwardRouteList.size(); i++)
		{
			List<Integer> temp = forwardRouteList.get(i);
			find(temp, returnRouteList, maxTravelDist );	
		}
		System.out.println(map);
		for(int val: map.values())
		{
			if(val == 0)
			{
				min = 0;
				break;
			}
			else if(val < min)
			{
				min = val;
			}
			
		}
//		

		
		for(Map.Entry<List<Integer>, Integer> e: map.entrySet())
		{
			if(e.getValue() == min)
			{
				result.add(e.getKey());
			}
		}
		return result;
	}
	
	public static HashMap<List<Integer>, Integer>  find(List<Integer> temp, List<List<Integer>> returnRouteList, int maxTravelDist )
	{
		int min = Integer.MAX_VALUE;
		List<Integer> index = new ArrayList<>(2);
		int id1 =0, id2 = 0;
		for(int j = 0; j < returnRouteList.size(); j++)
		{
			List<Integer> btemp = returnRouteList.get(j);
			int val  = temp.get(1)+ btemp.get(1);
			
			if(maxTravelDist -val < 0)
				continue;
			
			else 
				if(min > maxTravelDist -val)
			{
				
				min = maxTravelDist  - val;
				//index.add(min);
				id1 = temp.get(0);
				id2 = btemp.get(0);
				
				
			}
		}
		index.add(id1);
		index.add(id2);
		map.put(index, min);
		return map;
		
	}
	
	public static void main(String[] args)
	{
		
		int maxTravelDist  = 10000;
		int [][] aa = new int [][] {{1,3000},{2,5000},{3,7000},{4,10000}};
		int [][] bb = new int [][] {{1,2000},{2,3000},{3,4000},{4,5000}};
		List<List<Integer>> a = new ArrayList<>();
		List<List<Integer>> b = new ArrayList<>();
		for(int i = 0; i < aa.length; i++)
		{
			List<Integer> temp = new ArrayList<>();
			for(int j = 0; j < aa[i].length; j++)
			{
				
				temp.add(aa[i][j]);
			}
			a.add(temp);
		}
		System.out.println(a);
	
		for(int i = 0; i < bb.length; i++)
		{
			List<Integer> temp = new ArrayList<>();
			for(int j = 0; j < bb[i].length; j++)
			{
				
				temp.add(bb[i][j]);
			}
			b.add(temp);
		}
		System.out.println(b);
		
		
		
		System.out.println(AmazonsumClosest.test(a, b, maxTravelDist ));

	}

}
