
package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.math3.stat.descriptive.rank.Median;

public class WindowString
{
	
	public static int [] window(int[] nums, int k)
	{
		int n = nums.length;
		List<Integer> result = new ArrayList<>();
		
		double sum = 0;
		if(k % 2 == 0)
		{
			for(int i = 0; i <= n-k; i++)
			{
				int l = i;
				int j = 0;

				while(j < k)
				{
					sum += nums[l];
					l++;
					j++;
				}
				System.out.println("sum for each time  "+ sum);
				sum = sum/k;
				System.out.println(sum);
				if(sum < 0.5)
				{
					result.add(-1);
					sum = 0;
				}
				else
				{
					double x = Math.ceil(sum);
					result.add((int) x);
					sum = 0;
				}
			}
		}
		else
		{
			
			for(int m = 0; m <= n-k; m++)
			{
				int e = m;
				int f = 0;
				List<Integer> temp = new ArrayList<>();
				while(f < k)
				{
					temp.add(nums[e++]);
					f++;
				}
				Collections.sort(temp);
				System.out.println(temp);
				result.add(temp.get(temp.size()/2));
				f = 0;
				
				temp.clear();
				
			}
		}
		System.out.println(result);
		int [] res = new int [result.size()]; 
		for(int i = 0; i < result.size(); i++)
			res[i] = result.get(i);
		return res;
	}

	public static void main(String[] args)
	{
		int [] nums = new int [] {1,3,-1,-3,5,3,6,7, 9, 5};
		double [] val = new double []{1.0,3.0,-1.0,-3.0};
		Median median = new Median();
		double evalute = median.evaluate(val);
		System.out.println(evalute);
		int k = 3;
		System.out.println(WindowString.window(nums, k));
		
	}

}
