import java.util.ArrayList;


public class RotateArray {

	public static void  Rotate(int [] a, int k)
	{
		int [] aa = new int[a.length];
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < a.length; i++)
		{
			aa[(i+k)% a.length] = a[i];
		}
		for(int i =0; i< a.length; i++)
		{
			a[i] = aa[i];
			result.add(a[i]);
		}
		System.out.println(result);
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		int [] a = new int [] {-1,-100,3,99};
		int k = 2;
		RotateArray.Rotate(a, k);
	}
}
