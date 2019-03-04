
import java.util.HashMap;
import java.util.HashSet;


public class FirstMissing {

	public static int firstMissingXor(int[] fullarray,int [] partialarray)
	{
		int xor = 0;
		for(int i = 0; i < fullarray.length; i++)
		{
			xor = xor ^ fullarray[i];
		}
		
		for(int i = 0; i < partialarray.length; i++)
		{
			xor = xor ^ partialarray[i];
		}
		return xor;
	}
	
	public static int firstMissingCount(int[] fullarray,int [] partialarray)
	{
		int sum = 0;
		for(int i = 0; i < fullarray.length; i++)
		{
			sum += fullarray[i];
		}
		for(int i = 0; i < partialarray.length; i++)
		{
			if(sum < 0)
			{
				return -1;
			}
			else
				sum -= partialarray[i];
		}
		return sum;
	
	}
	
	public static int firstMissingSet(int[] fullarray,int [] partialarray)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		int ans = 0;
		
		for(int i =0 ; i < partialarray.length; i++)
			set.add(partialarray[i]);
		
		for(int i = 0; i < fullarray.length; i++)
		{
			if(set.contains(fullarray[i]))
				continue;
			else
				ans = fullarray[i];
		}
		return ans;
		
	}
	
	public static int firstMissingMap(int[] fullarray,int [] partialarray)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		for(int i = 0; i < partialarray.length; i++)
			map.put(partialarray[i], 1);
		
		for(int i =0; i < fullarray.length; i++)
		{
			if(map.containsKey(fullarray[i]))
				continue;
			else 
				ans = fullarray[i];
		}
		return ans;
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] fullarr = new int [] {3,5,2,6,9,12};
		int [] partialarr = new int [] {5,2,3,9,12};
		System.out.println(FirstMissing.firstMissingXor(fullarr, partialarr));
		System.out.println(FirstMissing.firstMissingCount(fullarr, partialarr));
		System.out.println(FirstMissing.firstMissingSet(fullarr, partialarr));
		System.out.println(FirstMissing.firstMissingMap(fullarr, partialarr));
	}
}
