package recursion;

public class FindMAX {

	public static int max(int [] a, int n)
	{
		if(n == 0)
			return a[0];
		
		return Math.max(a[n-1], max(a, n-1));
	}
	
	
	public static boolean find(int [] a, int n, int target)
	{
		if(n == 0)
			return false;
		if(a[n] == target)
			return true;
	
		
		return find(a, n-1, target);
	}
	
	public static void main(String[] args)
	{
		int a [] = new int[] {5,6,7,3,19, 45, 12,23,6,7};
		int n = a.length;
		int target = 2;
		System.out.println(FindMAX.max(a, n-1));
		System.out.println(FindMAX.find(a, n-1, target));
	}
}
