import java.util.ArrayList;

public class SerachElemetIn2D {
	
	
	public static boolean matrix(int [][] a, int target)
	{
		//int i = 0;
		int row = -1;
		int n = a.length;
		int m = a[0].length;
		//int j = n-1;
		
		for(int i =0; i < m; )
		{
			if((a[i][0] <= target) && (a[i][n] >= target));
			{
				row = i;
				System.out.println(a[i][0]);
				System.out.println(a[i][n]);
				System.out.println(row);
				//break;
			}
			if(!(a[i][0] <= target) && !(a[i][n] >= target))
					i++;	
		}
		if(row == -1)
			return false;
		
		for(int j=0; j<=n; j++)
		{
			if(a[row][j] == target)
				return true;
		}
		return false;
		
		
	}

	
	public static void main(String [] args)
	{
	// This ArrayList is just for storing results and show in better way
			ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
			int target;
			//This is the array we are taking as an input.
			int a [][] = new int[][] {{1,3,5,7}, 
									  {10,11,16,19}, 
									  {21,27,31,40}};
									  for(int i = 0; i < a.length; i++)
										{
											for(int j = 0; j <a[0].length; j++)
											{
												target = a[i][j];
												System.out.println(SerachElemetIn2D.matrix(a, target));
											}
											
										}
			
			
			//Static function call thats why using Class name with that so 
			//it knows this function is part of this class
									  
			
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
