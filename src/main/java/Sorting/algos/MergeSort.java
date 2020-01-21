package Sorting.algos;

public class MergeSort
{
	
	 void merge(int arr[], int l, int m, int r) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        /* Create temp arrays */
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays 
	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	
	 void printarr(int [] nums)
	{
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i]+" ");
	}
	
	 void sort(int [] nums, int left, int right)
	{
		if(left < right)
		{
			int mid = (left+right)/2;
			
			sort(nums, left, mid);
			sort(nums,mid+1, right);
			
			merge(nums, left,mid, right);
		}
	}

	
	public static void main(String [] args) throws InterruptedException
	{
		int [] nums = new int [] {3,5,2,4,1,8,7,100,44,76,75,24,63,55,22};
		
	
		
		int left = 0; int right = nums.length-1;
		MergeSort ob1 = new MergeSort();
		System.out.println("Unsorted");
		ob1.printarr(nums);
		ob1.sort(nums, left, right);
		System.out.println();
		System.out.println("sorted");
		ob1.printarr(nums);
		
	}
}
