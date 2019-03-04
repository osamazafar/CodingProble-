import java.util.Arrays;

public class Closest3sum {

	public int threeSum(int [] a, int target)
	{
		int n = a.length;
		Arrays.sort(a);
		int res = a[0] + a[1] + a[n-1];
		
		for(int i =0; i < n-2; i++)
		{
			int j = i+1;
			int k = n-1;
			while(j < k)
			{
				int sum = a[i] + a[j] + a[k];
				if(sum == target)
					return target;
				else if(sum < target)
					j++;
				else
					k--;
				int diff1 = Math.abs(sum - target);
				int diff2 = Math.abs(res - target);
				if(diff1 < diff2)
					res = sum;
			
				
			}
		}
		return res;

	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] a = new int [] {-1, 2, 1, -4};
		int target = 1;
		Closest3sum ob1 = new Closest3sum();
		System.out.println(ob1.threeSum(a, target));
	}
	
	
}
