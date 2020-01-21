package LinkedList;

public class SwapNodes
{
	public static ListNode swap(ListNode head)
	{
		if(head == null || head.next == null)
			return head;
		
		ListNode slow = head;
		ListNode fast = slow.next;
		ListNode prev = null;
		ListNode result = fast;
		while(slow != null && fast != null)
		{
			ListNode next = fast.next;
			
			if(prev != null)
			{
				prev.next = fast;
			}
			
			slow.next = next;
			fast.next = slow;
			prev = slow;
			
			if((slow = slow.next) == null) break;
			
			//Understand this line
			if((fast = slow.next) == null ) break;
			
		}
		return result;
	
	}
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		ListNode list = new ListNode(0);
		
		nthElementFromEnd.insert(list, 1);
		nthElementFromEnd.insert(list, 2);
		nthElementFromEnd.insert(list, 3);
		nthElementFromEnd.insert(list, 4);
		nthElementFromEnd.insert(list, 5);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.printList(list);
		nthElementFromEnd.printList(swap(list));
	}
}
