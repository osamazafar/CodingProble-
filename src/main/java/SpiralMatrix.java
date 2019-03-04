import java.util.ArrayList;

public class SpiralMatrix {

	public static ArrayList<Integer> spiral(int [][] a)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		int top = 0;
		//int left= 0;
		int right = a.length;
		int bottom = a[0].length-1;
		int n = a.length;
		int m = a[0].length;
		int len = m * n;
		int c = 0;
		
		while(c < len)
		{
			for(int i = top; i <= right; i++)
			{
				result.add(a[top][i]);
				c++;
			}
		
		
			
			for(int i = top; i <= bottom; i++)
			{
				result.add(a[right][i]);
				c++;
			}
			
			
		}
		return result;
	}
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		int a[][] = new int [][]{{1, 2, 3, 4}, 
								  {5, 6, 7, 8},
								  {9,10,11,12}};
								  
		System.out.println(SpiralMatrix.spiral(a));
	}
}
