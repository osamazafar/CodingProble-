package LinkedList;

public class CirculerSortedList
{
	 ListNode head;
	 CirculerSortedList()
	{
		head = null;
	}
	
	
	
//	public void makeList(ListNode node)
//	{
//		ListNode current = head;
//		if(current == null)
//		{
//			node.next = node;
//			head = node;
//		}
//		else if(node.val <= current.val)
//		{
//			while(current.next != head)
//			{
//				current = current.next;
//			}
//			current.next = node;
//			node.next = head;
//			head = node;
//			
//		}
//		else
//		{
//			while(current.next != head && current.next.val < node.val)
//				current = current.next;
//			node.next = current.next;
//			current.next = node;
//			
//		}
//			
//	}
	
//	void printList() 
//    { 
//        if (head != null) 
//        { 
//            ListNode temp = head; 
//            do
//            { 
//                System.out.print(temp.val + " "); 
//                temp = temp.next; 
//            }  while (temp != head); 
//        } 
//    } 
	
	void printList()
	{
		if(head != null)
		{
			ListNode temp = head;
			do {
				System.out.print(temp.val + " ");
				temp = temp.next;
			} while(temp != head);
			
		}
	}
	
	
	
	void insert(ListNode node)
	{
		ListNode current = head;
		
		if(current == null)
		{
			node.next = node;
			head = node;
		}
		else {
			while(current.next != null)
				current = current.next;
			current.next = node; 
			current = head;
			
		}
	}
	
	public static void main(String [] args) throws InterruptedException
	{
		CirculerSortedList list = new CirculerSortedList();
		int [] a = new int [] {24,564,6,4,7745,7,99,88};
		ListNode temp = null;
		
		for(int i = 0; i< a.length; i++)
		{
			temp = new ListNode(a[i]);
			//list.makeList(temp);
			list.insert(temp);
		}
		list.printList();
	}
}
