import java.util.ArrayList;

public class MoveZeroes {

	public static void  move(int [] a)
	{
		int n = a.length;
		int start = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++)
		{
			if(a[i] != 0)
			{
				swap(a, i, start);
				start++;
			}
		}
		
		for(int i = 0; i < a.length; i++)
			result.add(a[i]);
		System.out.println(result);
		
	}
	
	public static void moveforward(int [] a)
	{
		ArrayList<Integer> result2 = new ArrayList<Integer>();
		int n = a.length;
		int start = 0;
		for(int i = 0; i < n; i++)
		{
			if(a[i] == 0)
			{
				swap(a, i, start);
				start++;
			}
		}
		for(int i = 0; i < a.length; i++)
			result2.add(a[i]);
		System.out.println(result2);
	}
	
	
	public static void swap(int []a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		int a [] = new int [] {2,4,0,7,0,0,1,0};
		MoveZeroes.move(a);
		MoveZeroes.moveforward(a);
		
	}
}
