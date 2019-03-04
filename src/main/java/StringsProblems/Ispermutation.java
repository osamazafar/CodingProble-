package StringsProblems;

import java.util.Arrays;

public class Ispermutation {

	public boolean per1(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		char [] ss1 = s1.toCharArray();
		char [] ss2 = s2.toCharArray();
		Arrays.sort(ss1);
		Arrays.sort(ss2);
		s1 = String.valueOf(ss1);
		s2 = String.valueOf(ss2);
		System.out.println(s1);
		System.out.println(s2);
		return (s1.equals(s2))? true:false;
	}
	
	
	public boolean per(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		
		int [] letter = new int [128];
		for(int i = 0; i< s1.length(); i++)
		{
			int val = s1.charAt(i) - 'a';
			letter[val]++;
			//System.out.println(letter[i]);
		}
		
		for(int i = 0; i< s2.length(); i++)
		{
			int val = s2.charAt(i) - 'a';
			letter[val]--;
			//System.out.println(letter[i]);
			if(letter[val] < 0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "level";
		String t = "vllee";
		Ispermutation ob1 = new Ispermutation();
		System.out.println(ob1.per1(s, t));
		System.out.println(ob1.per
				(s, t));
		
	}
}
