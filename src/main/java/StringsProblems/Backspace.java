package StringsProblems;

import java.util.Stack;

public class Backspace {

	public  boolean compare(String s, String t)
	{
		Stack<Character> set = new Stack<Character>();
		Stack<Character> set1 = new Stack<Character>();
		for(int i=0;i < s.length(); i++)
		{
			if(s.charAt(i) != '#')
			{
			set.push(s.charAt(i));
			}
			else {
				set.pop();
			}
		}
		
		for(int i = 0; i< t.length(); i++)
		{
			if(t.charAt(i) != '#')
			{
			set1.push(t.charAt(i));
			}
			else {
				set1.pop();
			}
		}
		System.out.println(set);
		System.out.println(set1);
		while(!set.isEmpty() && !set1.isEmpty())
		{
			if(set.pop() != set1.pop())
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "ab#c"; 	//ac
		String t = "ad#ce"; //ac
		Backspace ob1 = new Backspace();
		System.out.println(ob1.compare(s, t));
	}
}
