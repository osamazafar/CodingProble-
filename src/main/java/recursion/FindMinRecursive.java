package recursion;

public class FindMinRecursive {

	public static int minimum(int [] a, int n)
	{
		if(n == 0)
			return a[0];
		
		return Math.min(a[n-1], minimum(a,n-1));
		
	}
	
	
	public static void main(String[] args)
	{
		int [] a = new int [] {3,4,7,11,18,29};
		int n = a.length;
		System.out.println(FindMinRecursive.minimum(a, n));
	}
}
