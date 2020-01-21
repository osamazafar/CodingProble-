import java.util.ArrayList;
import java.util.HashSet;

public class Intersaction
{

	public static ArrayList<Integer> intersaction(int [] nums1, int [] nums2)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < nums1.length; i++)
		{
			if(!set.contains(nums1[i]))
				set.add(nums1[i]);
		}
		
		for(int j = 0; j < nums2.length; j++)
		{
			if(set.contains(nums2[j]) && !result.contains(nums2[j]))
				result.add(nums2[j]);
		}
		return result;
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] nums1 = new int [] {1,2,2,1};
		int [] nums2 = new int [] {2,2};
		System.out.println(Intersaction.intersaction(nums1, nums2));
	}
}
