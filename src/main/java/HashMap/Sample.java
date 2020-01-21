package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Sample
{

	
	public ArrayList<ArrayList<String>> compare(String [] alpha, String [] bravo)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		ArrayList<String> common = new ArrayList<String>();
		ArrayList<String> added = new ArrayList<String>();
		ArrayList<String> removed = new ArrayList<String>();
		
		for(int i = 0; i < alpha.length; i++)
			{
				if(map.containsKey(alpha[i]))
				{
					map.put(alpha[i], map.get(alpha[i])+1);
				}
				else
					map.put(alpha[i], 1);
			}
	
		for(int i = 0; i < bravo.length; i++)
		{
			if(map.containsKey(bravo[i]))
			{
				map.put(bravo[i], map.get(bravo[i])-1);
			}
			else
				map.put(bravo[i], -1);
		}

	
		for(Map.Entry<String, Integer> e: map.entrySet())
		{
			
			
			if(e.getValue() == 0)
			{
				common.add("Repeated:  "+e.getKey());
			}
			if(e.getValue() == 1)
			{
				added.add("Removed:  "+e.getKey());
			}
			if(e.getValue() == -1)
			{
				removed.add("Added:   "+ e.getKey());
			}
		}
		
		result.add(common);
		result.add(added);
		result.add(removed);
		
		return result;
		
		
	}
	
	
	
	public static void main(String [] args) throws InterruptedException
	{
		String [] alpa = new String []  {"7aec47f359bb75b768eeb95fa73b3a22d2fb053f6db3bb38daaff289512194c6", "f05e411f0e98d2ea40dcd2630d9e87a3587e61f44e28c9ab93925aa652c354f0", "813c9c630a770b91a829b072ae69b3582092a51d8406d5c3c18da1e3080f3452", "7aec47f359bb75b768eeb95fa73b3a22d2fb053f6db3bb38daaff289512194c7", "813c9c630a770b91a829b072ae69b3582092a51d8406d5c3c18da1e3080f3459"};
		
		String [] bravo = new String [] {"7aec47f359bb75b768eeb95fa73b3a22d2fb053f6db3bb38daaff289512194c6", "f05e411f0e98d2ea40dcd2630d9e87a3587e61f44e28c9ab93925aa652c354f0", "caccfde4071a22b06a5c7897c54cfe2d8812a254714882e80c7ff75aac6fa187", "7aec47f359bb75b768eeb95fa73b3a22d2fb053f6db3bb38daaff289512194c7", "813c9c630a770b91a829b072ae69b3582092a51d8406d5c3c18da1e3080f3451"};
		Sample sm = new Sample();
		System.out.println(sm.compare(alpa, bravo));
	}
}
