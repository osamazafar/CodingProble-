package stacks;

import java.util.Stack;

public class MinimumAddtoMakeParanthesisValid921
{
	
	public static int solution(String s)
	{
		Stack<Character> stack = new Stack<>();
		int count = 0;
		char [] ch  = s.toCharArray();
		for(int i = 0; i < ch.length; i++)
		{
			
			if(ch[i] == '(')
				stack.push(ch[i]);
			else if(ch[i] == ')' && !stack.isEmpty())
			{
				if(stack.peek().equals('('))
					stack.pop();
			}
			else if((ch[i] == ')' && stack.isEmpty()))
			{
				count++;
			}
			
				
			System.out.println(stack);
		}
		System.out.println(count+"count");
		return count + stack.size();
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		String s = "()))(( ()) ((( () )()()( ))((";
		String [] str = s.split(" ");
		for(String i: str)
			System.out.println(MinimumAddtoMakeParanthesisValid921.solution(i));

	}

}
