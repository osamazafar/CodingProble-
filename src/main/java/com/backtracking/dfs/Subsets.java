package com.backtracking.dfs;
import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {

	public ArrayList<ArrayList<Integer>> sets(int [] a)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		//result.add(new ArrayList<Integer>());
		if(a.length == 0)
		{
			return result;
		}
		Arrays.sort(a);
		gen(a, result, new ArrayList<Integer>(), 0);
		return result;
	}
		public void gen(int[] a ,ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp, int index)
		{
			for(int i = index; i < a.length; i++)
			{
				temp.add(a[i]);
				result.add(new ArrayList<Integer>(temp));
				gen(a, result, temp, i+1);
				temp.remove(temp.remove(temp.size()-1));
				
			}
		
		}
	
	public static void main(String[] args ) throws InterruptedException
	{
		int [] a= new int[] {1,2,3};
		Subsets ob1 = new Subsets();
		System.out.println(ob1.sets(a));
	}
}
