package StringsProblems;



public class AddBinary {

	
	public static String add(String s, String t)
	{
		int i = s.length()-1;
		int j = t.length()-1;
		int sum = 0;
		StringBuilder result = new StringBuilder();
		while(i >=0 || j >= 0)
		{
			if(i >= 0)
			{
				sum += s.charAt(i) - '0';
				i--;
			}
			if(j >= 0)
			{
				sum += t.charAt(j) - '0';
				j--;
			}
			result.append(sum%2);
			sum /=2;
		}
		
		if(sum != 0)
			result.append(1);
		return result.toString();
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		String s = "101101";
		String t =   "0110";
		System.out.println(AddBinary.add(s, t));
	}
}
