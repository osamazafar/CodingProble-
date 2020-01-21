package LinkedList;


public class Reverse 
{
	ListNode head;
	
          
	
	 public static ListNode insert(ListNode list, int data) 
	    { 
	        // create a new node with given data 
	        ListNode new_node = new ListNode(data); 
	        new_node.next = null; 
	  
	        // if the linked list is empty, 
	        // then make the new node as head 
	        if (list == null) { 
	            list = new_node; 
	        } 
	        else { 
	            // else traverse till the last node 
	            // and insert the new_node there 
	            ListNode last = list; 
	            while (last.next != null) { 
	                last = last.next; 
	            } 
	  
	            // insert the new_node at last node 
            last.next = new_node; 
			} 	       
		return list;
	    } 
	 
	 public static void printList(ListNode list) 
	    { 
	        ListNode node = list;
	        System.out.print("LinkedList: ");
	        while(node != null)
	        {
	        	System.out.print(node.val + " ");
	        	node = node.next;
	        }
	        
	    }


	 public static ListNode reverse(ListNode list)
	 {
		 ListNode prev = null;
		 while(list != null)
		 {
			 ListNode next = list.next;
			 list.next = prev;
			 prev = list;
			 list = next;
		 }
		 return prev;
	 }
	 
	 
	 public static ListNode rev(ListNode head)
	 {
		if(head == null || head.next == null)
			return head;
		ListNode p = rev(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	 }
	 
	 

	public static void main(String [] args) throws InterruptedException
	{
		ListNode list = new ListNode(0);
		
		  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
       list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        printList(list);
        printList(reverse(list));
        //printList(rev(list));
       
	}
}