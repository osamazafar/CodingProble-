package LinkedList;

public class OddAndEven
{

	
	public static ListNode oddeven(ListNode head)
	{
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenhead = even;
		
		while(even != null && even.next != null)
		{
			odd.next = even.next;
			odd = odd.next;
			
			even.next = odd.next;
			even = even.next;
			
		}
		odd.next = evenhead;
		return head;
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
		nthElementFromEnd.printList(oddeven(list));
	}
}
