package StringsProblems;

import java.util.Stack;

public class validPara
{


	
	public static boolean parathesis(String s)
	{
		Stack<Character> st = new Stack<Character>();
		if(s.length() % 2 != 0)
			return false;
		for(char c: s.toCharArray())
		{
			if(c == '(')
			{
				st.push(')');
			}
			else if(!st.isEmpty() && st.pop()!= c)
			{
				return false;
			}
				
		}
		return true;
	}
	
	
	public static int palindromdiff(String t)
	{
		int i = 0; 
		int j = t.length()-1;
		int count = 0;
		
		while(i < j)
		{
			if(t.charAt(i) != t.charAt(j))
			{
				count++;
			}
			
				i++;
				j--;
			
		}
		return count*2;
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		String s =  "((()))()";
		String t = "abfdcea";
		
		System.out.println(validPara.parathesis(s));
		System.out.println(validPara.palindromdiff(t));
		
	}
}
