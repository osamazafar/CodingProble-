import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression
{

	
	public static boolean find()
	{
		
		String s = "(123)4567890";
		
		String regex = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
		
		Pattern pattern = Pattern.compile(regex);
		
			Matcher matcher = pattern.matcher(s);
		return matcher.matches();
	}
	
	public static void main(String [] args) throws InterruptedException
	{
		
		System.out.println(RegularExpression.find());
	}
}
