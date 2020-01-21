package LinkedList;

public class MiddleofList
{
	
	public static ListNode middle(ListNode head)
	{
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		//slow.next = null;
		return slow;
	}

	public static void main(String[] args)
	{
		ListNode list = new ListNode(0);
		
		nthElementFromEnd.insert(list, 1);
		nthElementFromEnd.insert(list, 2);
		nthElementFromEnd.insert(list, 3);
		nthElementFromEnd.insert(list, 4);
		nthElementFromEnd.insert(list, 5);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 7);
	
		nthElementFromEnd.printList(list);
		nthElementFromEnd.printList(middle(list));
		
	
	}
}
