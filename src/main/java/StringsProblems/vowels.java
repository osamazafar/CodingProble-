package StringsProblems;
import java.util.HashSet;

public class vowels {

	public int arrayvowel(String s)
	{
		String t = "AEIOUaeiou";
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;  i < t.length(); i++)
		{
			set.add(t.charAt(i));
		}
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			
			if(set.contains(s.charAt(i)))
				count += s.length()-i;
		}
		return count % 10003;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "ABCDEC";
		vowels ob1 = new vowels();
		System.out.println(ob1.arrayvowel(s));
	}
}
