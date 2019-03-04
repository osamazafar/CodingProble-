package recursion;

public class RepeatedElement {

	
	
	public static int repeat(int [] a, int n, int target, int count)
	{
		if(n == 0)
			return count;
		
		if(a[n] == target && n>=0)
		{
			++count;
		}
		
		return repeat(a, n-1, target, count);
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		int [] a = new int[] {1,1,1,1,3,4,1,5,1,1,1,0};
		int target = 1;
		int n = a.length;
		int count = 0;
		System.out.println(RepeatedElement.repeat(a, n-1, target, count));
		
	}
}
