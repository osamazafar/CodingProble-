package LinkedList;

public class ListCycle
{

	
	public static void cycle(ListNode head)
	{
		ListNode connect = null;
		if(head.next.next != null)
			connect = head.next.next;
		
		ListNode node = head;
		
		while(node.next != null)
		{
			node = node.next;
		}
		node.next = connect;
			
	}
	
	
	public static boolean isCycle(ListNode head)
	{
		if(head == null || head.next == null)
			return true;
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while(slow != fast)
		{
			if(fast == null || fast.next == null)
				return false;
			
			slow = slow.next;
			fast = fast.next.next;
		}
		//System.out.println(fast.val);
		return true;
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
		
		ListCycle.cycle(list);
		
		System.out.println(ListCycle.isCycle(list));
	
	}
}
