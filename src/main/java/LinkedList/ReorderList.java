package LinkedList;



public class ReorderList
{
	
	public static ListNode reorder(ListNode head)
	{
		if(head == null || head.next == null)
			return null;
		
		ListNode slow =head;
		ListNode fast = head.next;
		//ListNode dummy;// = new ListNode(0);
		ListNode dummy2 = new ListNode(0);
		
	     while (fast.next != null && fast.next.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	
		dummy2.next = slow.next;
		slow.next = null;
		dummy2 = reverse(dummy2.next);
		
		
		
		ListNode result = new ListNode(0);
		ListNode node = result;
		
		while(head != null && dummy2 != null)
		{
			
			node.next = head;
			node = node.next;
			head = head.next;
			node.next = dummy2;
			dummy2 = dummy2.next;
			node = node.next;
			
		}
		
		return result.next;
		
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

	
	public static void main(String[] args)
	{
		ListNode list = new ListNode(0);
		
		nthElementFromEnd.insert(list, 1);
		nthElementFromEnd.insert(list, 2);
		nthElementFromEnd.insert(list, 3);
		nthElementFromEnd.insert(list, 4);
		nthElementFromEnd.insert(list, 5);
		nthElementFromEnd.insert(list, 6);
		//nthElementFromEnd.insert(list, 7);
	
		nthElementFromEnd.printList(list);
		System.out.println("");
		nthElementFromEnd.printList(reorder(list));
		
	
	}
}
