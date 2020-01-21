package StringsProblems;

public class RevereWord {

	public static String reverse(String s)
	{
		String [] str = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < str.length; i++)
        {
            String val = str[i];
            val = reverseString(val);
            sb.append(val);
            sb.append(" ");
            
        }
        
        //String result = sb.toString();
        String result = sb.substring(0, sb.length()-1).toString();
        return result;
    }
    
    public static String reverseString(String s)
    {
    	char [] ch = s.toCharArray();
       int i = 0;
       int j = ch.length-1;
       String res;
       while(i < j)
       {
    	   char c = ch[i];
    	   ch[i] = ch[j];
    	   ch[j] = c;
    	   i++;
    	   j--;
       }
       res = String.copyValueOf(ch);
      // System.out.println(res);
       return res;
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		String s = "Let's take LeetCode contest";
		System.out.println(RevereWord.reverse(s));
	}
}
