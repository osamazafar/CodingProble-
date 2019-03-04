import java.util.ArrayList;

public class MinimumPathSum {

	public static int sum(int [][] a)
	{
		int n = a.length;
		int m = a[0].length;
		
		for(int i = 1; i <n; i++)
		{
			a[i][0] += a[i-1][0];
			System.out.println(a[i][0]);
		}
		
		for(int j = 1; j < m; j++)
		{
			a[0][j] += a[0][j-1];
		}
		
		
		 for(int i = 1; i < n; i++)
	        {
	            for(int j = 1; j < m; j++)
	            {
	                a[i][j] += Math.min(a[i-1][j], a[i][j-1]);
	            }
	        }
	        return a[n-1][m-1];
	}
	
	
	
	public static void main(String [] args)
	{
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	
	//This is the array we are taking as an input.
	int a [][] = new int[][] {{1,3,1}, 
							  {1,5,1}, 
							  {4,2,1}};
	//Static function call thats why using Class name with that so 
	//it knows this function is part of this class
							  
System.out.println(MinimumPathSum.sum(a));
	// just going through for loop and each time creating temp array
	// add that array into result which can hold multiple array
	for(int i = 0; i < a.length; i++)
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int j = 0; j <a[0].length; j++)
		{
			temp.add(a[i][j]);
		}
		result.add(temp);
	}
	System.out.println(result);
	}
}
	
