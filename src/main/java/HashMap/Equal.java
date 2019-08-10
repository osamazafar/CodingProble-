package HashMap;

import java.util.ArrayList;
import java.util.HashMap;


public class Equal
{

	public static ArrayList<Integer> equalTwo(int [] nums)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i =0; i < nums.length; i++)
		{
			for(int j = i+1; j < nums.length; j++)
			{
				int sum = nums[i] + nums[j];
				if(map.containsKey(sum))
				{
					ArrayList<Integer> index = map.get(sum);
					int index1 = index.get(0);
					int index2 = index.get(1);
					if(index1 != i && index1 != j && index2 != j && index2 != i )
					{
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(index1);
						temp.add(index2);
						temp.add(i);
						temp.add(j);
				
						
						if(result.size() == 0)
						{
							result = temp;
						}
						else
						{
							 for(int k=0;k<result.size();k++)
	                            {
	                                if(result.get(k)<temp.get(k))
	                                    break;
	                                else if(result.get(k)>temp.get(k))
	                                {
	                                    result=temp;
	                                    break;
	                                }
	                            }
						}
					}
				}
					
			else
				{
					ArrayList<Integer> l = new ArrayList<Integer>();
					l.add(i);
					l.add(j);
					map.put(sum, l);
				}
			}
		}
		return result;
	}
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		int [] nums = new int [] {3, 4, 7, 1, 2, 9, 8};
		System.out.println(Equal.equalTwo(nums));
	}
}
