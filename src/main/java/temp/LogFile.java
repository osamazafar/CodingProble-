package temp;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class LogFile
{
	
	public static String [] rearrange(String [] logs)
	{
		 List<String> orderedLogs = new ArrayList<>();
	        List<String> onlyLetterParts = new ArrayList<>();
	        int letterLogCount = 0;


	        for(int i = 0; i < logs.length; i++){
	            int j = logs[i].indexOf(' ');
	            if(Character.isDigit(logs[i].charAt(j + 1))) {
	                orderedLogs.add(logs[i]);
	                continue;
	            }

	            String next = logs[i].substring(j + 1);
	            System.out.println(next);
	      
	            int index = 0;
	            while((index < letterLogCount) && (next.compareTo(onlyLetterParts.get(index)) >= 0)){
	                if(next.compareTo(onlyLetterParts.get(index)) == 0){
	                    if(logs[i].compareTo(orderedLogs.get(index)) < 0)
	                        break;
	                }
	                ++index;
	            }
	            orderedLogs.add(index, logs[i]);
	            onlyLetterParts.add(index, next);
	            ++letterLogCount;
	        }
	        return orderedLogs.toArray(new String[orderedLogs.size()]);
		
	}
	
	
//	public static String [] reorderLogfile(String [] logs)
//	{
//		PriorityQueue<String> letterLogsQueue = new PriorityQueue<> ( 
//				new Comparator<String>() {
//	                @Override
//	                public int compare(String s1, String s2) {
//	                    
//	                    String s1IngoreIndentifier = s1.substring(s1.indexOf(" "));
//	                    String s2IngoreIndentifier = s2.substring(s2.indexOf(" "));
//	                    
//	                    char[] chars1 = s1IngoreIndentifier.toCharArray();
//	                    char[] chars2 = s2IngoreIndentifier.toCharArray();
//	                    for(int i = 0; i < Math.min(chars1.length, chars2.length); i++) {
//	                        if (chars1[i] == chars2[i]) continue;
//	                        return chars2[i] - chars1[i];
//	                    }
//	                    
//	                    if(chars1.length < chars2.length) {
//	                        return 1;
//	                    } else {
//	                        return -1;
//	                    }
//	                }
//	            }
//	        );
//	        
//	        
//	        List<String> result = new ArrayList<>();
//	        
//	        for (String log : logs) {
//	            
//	            int firstSpaceIndex = log.indexOf(" ");
//	            
//	            if(Character.isDigit(log.charAt(firstSpaceIndex + 1))) {
//	                result.add(log);
//	            } else {
//	                letterLogsQueue.offer(log);
//	            }
//	        }
//	        
//	      
//	        while(!letterLogsQueue.isEmpty()) {
//	            result.add(0, letterLogsQueue.poll());         
//	        }
//	        
//	        return result.toArray(new String[logs.length]);
//	    }
//		
//	}

	
	public static void main(String[] args)
	{
		
		String [] str = new String [] {"a1 9 2 3 1", "g1 act car" ,"zo4 4 7", "ab1 off key dog", "a8 act zoo"};
	
		System.out.println(LogFile.rearrange(str));
		//System.out.println(logfiles);
		//System.out.println(LogFile.reorderLogfile(str));
		
	}

}
