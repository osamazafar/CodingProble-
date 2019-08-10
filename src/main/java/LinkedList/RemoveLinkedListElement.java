package LinkedList;

public class RemoveLinkedListElement
{


	public static ListNode remove(ListNode head, int val)
	{
		
		while(head.val == val)
		{
			head = head.next;
		}
		
		if(head == null)
		{
			return null;
		}
		
		ListNode prev = head;
		
		while(prev.next != null)
		{
			if(prev.next.val == val)
				prev.next = prev.next.next;
			else
				prev = prev.next;
		}
		return head;
		
		
	}
	
	
	public static ListNode remov(ListNode head, int val)
	{
		
		while(head.val == val)
			head = head.next;
		if(head == null)
			return null;
		ListNode prev = head;
		
		while(prev.next != null)
		{
			if(prev.next.val == val)
			{
				prev.next = prev.next.next;
			}
			else
				prev = prev.next;
		}
		return head;
	}
	
	public static void main(String[] args)
	{
		
		ListNode list = new ListNode(0);
		int val = 6;
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 1);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 3);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 5);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.printList(list);
		nthElementFromEnd.printList(remove(list, val));
		
		nthElementFromEnd.printList(remov(list, val));

	}

}
