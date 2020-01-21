package HashMap;

import java.util.Collections;
import java.util.PriorityQueue;

public class movingWindow
{

	static PriorityQueue<Integer> MAX_HEAP = new PriorityQueue<Integer>(Collections.reverseOrder());
    static PriorityQueue<Integer> MIN_HEAP = new PriorityQueue<Integer>();


    static void addNum(int num) {
        MAX_HEAP.add(num);   
        // Add to max heap


        MIN_HEAP.add(MAX_HEAP.peek());   

        MAX_HEAP.poll();
        
        //System.out.println(MAX_HEAP);

        //adjust size
        while (MAX_HEAP.size() < MIN_HEAP.size()) {                     
            MAX_HEAP.add(MIN_HEAP.peek());
            MIN_HEAP.poll();
        }
    }

    public static double findMedian() {
        return MAX_HEAP.size() == MIN_HEAP.size() ? ((double)MAX_HEAP.peek() + (double)MIN_HEAP.peek()) / 2.0 : MAX_HEAP.size() > MIN_HEAP.size() ? MAX_HEAP.peek() : MIN_HEAP.peek(); 
    }
    
   static void removeNum(int num) {
    	if(num <= MAX_HEAP.peek()) {
    		MAX_HEAP.remove(num);
    	}
    	else {
    		MIN_HEAP.remove(num);
    	}

    
    	
    }
	
	
	public static double [] window(int [] nums, int k)
	{
		int size = nums.length - k + 1;
    	double[] medians = new double[size];
    	for(int i = 0; i < k; i++) {
    		addNum(nums[i]);
    	}
    	medians[0] = findMedian();
    	for(int i = 1; i < size; i++) {
    		removeNum(nums[i - 1]);
    		addNum(nums[i + k - 1]);
    		medians[i] = findMedian();
    	}
    	System.out.println(MAX_HEAP);
    	System.out.println(MAX_HEAP);
    	return medians;
	}
	
	
	public static void main(String[] args)
	{
		int [] nums = new int [] {1,3,-1,-3,5,3,6,7, 9, 5};
		int k = 3;
		System.out.println(movingWindow.window(nums, k));
		
	}
}
