
public class AngleOfHourandMinutes
{
	
	
	public static double angle(int hour, int minutes)
	{
		if(hour == 0 || minutes == 0)
			return -1;
		
		if(hour == 12)
			hour = 0;
		if(minutes == 60)
		{
			minutes = 0;
			hour +=1;
		}
		
		
		double anglehour = (hour*60 + minutes) * 0.5;
		double anglemin = (6*minutes);
		
		double angle = Math.abs(anglehour-anglemin);
		
		return Math.min(360-angle, angle);
		
		
	}
	
	
	public static void main(String [] args)
	{
		System.out.println(angle(12,45));
	}

}
