package StringsProblems;

public class RevereWord {

	public static String reverse(String s)
	{
		s = s.trim();
		String [] str = s.split(" ");
		StringBuilder sb = new StringBuilder();
	
		
		
		for(int i= str.length-1; i>=0; i--)
		{
			if(str[i] != " ")
			sb.append(str[i]).append(" ");
			
		}
		return sb.substring(0, sb.length()-1);
		
	}
	
	
	public static void main(String[] args)
	{
		String s = "    the     sky is blue      ";
		System.out.println(RevereWord.reverse(s));
	}
}
