import java.util.ArrayList;

public class RotateMatrix {

	
	public static int [][] matrix(int mat[][])
	{
		//Taking the transpose of the matrix
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = i+1; j< mat[i].length; j++)
			{
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
		
		//just reversing the element in each row.
		for(int i = 0; i< mat.length; i++)
		{
			int x = 0;
			int y = mat.length-1;
			int n = mat.length;
		while(x <= n/2 && y >= n/2)
		{
			int temp = mat[i][x];
			mat[i][x] = mat[i][y];
			mat[i][y] = temp;                       
			x++;
			y--;
		}
		}
		
		
		return mat;
	}
	
	
	public static void main(String [] args)
	{
		// This ArrayList is just for storing results and show in better way
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		//This is the array we are taking as an input.
		int a [][] = new int[][] {{1,4,6,7},   
								  {2,3,5,8}, 
								  {11,9,13,12}, 
								  {10,14,16,15}};
		//Static function call thats why using Class name with that so 
		//it knows this function is part of this class
								  
		RotateMatrix.matrix(a);
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
