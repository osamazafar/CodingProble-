package LinkedList;

public class PartitionList
{
	
	public static ListNode partition(ListNode head, int x)
	{
		ListNode before_value = new ListNode(0);
		ListNode before = before_value;
		
		
		
		ListNode after_value = new ListNode(0);
		ListNode after = after_value;
		
		while(head != null)
		{
			if(head.val < x)
			{
				before.next = head;
				before = before.next;
			}
			else
			{
				after.next = head;
				after = after.next;
			}
			
			head = head.next;
		}
		
		after.next = null;
		before.next = after_value.next;
		
		return before_value.next;
	}

	public static void main(String[] args)
	{
		ListNode list = new ListNode(0);
		int x = 3;
		

		nthElementFromEnd.insert(list, 7);
		nthElementFromEnd.insert(list, 4);
		nthElementFromEnd.insert(list, 3);
		nthElementFromEnd.insert(list, 5);
		nthElementFromEnd.insert(list, 1);
		nthElementFromEnd.insert(list, 2);
		nthElementFromEnd.insert(list, 9);
		
		
		nthElementFromEnd.printList(list);
		nthElementFromEnd.printList(partition(list, x));
		
		
	
	}
}
