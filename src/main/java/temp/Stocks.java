package temp;

import java.util.ArrayList;


class Interval { 
    int buy, sell; 
} 

public class Stocks
{

	public static int bestPrice(int [] prices)
	{
		int maxProfit = Integer.MIN_VALUE;
		//int minValue = 0;
		
		for(int i = 0; i < prices.length-1; i++)
		{
			for(int j = i+1; j < prices.length; j++)
			{
				int val = prices[j] - prices[i];
				maxProfit = Math.max(maxProfit, val);
			}
			System.out.println(i+" "+ maxProfit);

		}
		return maxProfit;
		
	}
	
	
	
	public static int bp(int [] prices)
	{
		int minValue = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i = 1; i < prices.length; i++)
		{
			if(prices[i] < minValue)
				minValue = prices[i];
			else if(prices[i] - minValue > maxProfit)
			{
				maxProfit = prices[i]- minValue;
			}
		}
		return maxProfit;
	}
 
	
	static void stockBuySell(int price[], int n) 
    { 
        // Prices must be given for at least two days 
        if (n == 1) 
            return; 
  
        int count = 0; 
  
        // solution array 
        ArrayList<Interval> sol = new ArrayList<Interval>(); 
  
        // Traverse through given price array 
        int i = 0; 
        while (i < n - 1) { 
            // Find Local Minima. Note that the limit is (n-2) as we are 
            // comparing present element to the next element. 
            while ((i < n - 1) && (price[i + 1] <= price[i])) 
                i++; 
  
            // If we reached the end, break as no further solution possible 
            if (i == n - 1) 
                break; 
  
            Interval e = new Interval(); 
            e.buy = i++; 
            // Store the index of minima 
  
            // Find Local Maxima.  Note that the limit is (n-1) as we are 
            // comparing to previous element 
            while ((i < n) && (price[i] >= price[i - 1])) 
                i++; 
  
            // Store the index of maxima 
            e.sell = i - 1; 
            sol.add(e); 
  
            // Increment number of buy/sell 
            count++; 
        } 
  
        // print solution 
        if (count == 0) 
            System.out.println("There is no day when buying the stock "
                               + "will make profit"); 
        else
            for (int j = 0; j < count; j++) 
                System.out.println("Buy on day: " + sol.get(j).buy 
                                   + "        "
                                   + "Sell on day : " + sol.get(j).sell); 
  
        return; 
    }
	
	public static void main(String [] args) throws InterruptedException
	{
		int [] prices = new int [] {100,110, 85,105,102, 86, 63,81,101, 94,106,101, 79,94, 90,97};
		System.out.println(Stocks.bestPrice(prices));
		System.out.println(Stocks.bp(prices));
		Stocks.stockBuySell(prices, prices.length);
	}
}
