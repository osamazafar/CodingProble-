package LinkedList;

public class SortList
{

	public static ListNode sort(ListNode head)
	{
		if(head == null || head.next == null)
			return head;
		
		ListNode prev = null;
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null)
		{
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		prev.next = null;
		ListNode l1 = sort(head);
		ListNode l2 = sort(slow);
		
		return merge(l1,l2);
	}
	
	public static ListNode merge(ListNode l1, ListNode l2)
	{
		ListNode dummy = new ListNode(0);
		ListNode node = dummy;
		
		while(l1 != null && l2 != null)
		{
			if(l1.val < l2.val)
			{
				node.next = l1;
				l1 = l1.next;
			}
			else
			{
				node.next = l2;
				l2 = l2.next;
			}
			node = node.next;
		}
		
		if(l1 == null)
		{
			node.next = l2;
		}
		if(l2 == null)
		{
			node.next = l1;
		}
		
		return dummy.next;
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		ListNode list = new ListNode(0);
		
		nthElementFromEnd.insert(list, 2);
		nthElementFromEnd.insert(list, 7);
		nthElementFromEnd.insert(list, 5);
		nthElementFromEnd.insert(list, 3);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 4);
		nthElementFromEnd.printList(list);
		nthElementFromEnd.printList(sort(list));
	}
}
