package LinkedList;

public class RoatateList
{

	public static ListNode rotate(ListNode head, int k)
	{
		int len = 1;
		ListNode node = head;
		
		while(node.next != null)
		{
			node = node.next;
			len++;
		}
		
		node.next = head;
		
		 k %=len;
		 len -=k;
		
		while(len > 0)
		{
			node = node.next;
			len--;
		}
		head = node.next;
		node.next = null;
		
		return head;
	}
	
	
	public static void main(String[] args)
	{
		ListNode list = new ListNode(0);
		int k = 3;
		

		nthElementFromEnd.insert(list, 1);
		nthElementFromEnd.insert(list, 2);
		nthElementFromEnd.insert(list, 3);
		nthElementFromEnd.insert(list, 4);
		nthElementFromEnd.insert(list, 5);
		nthElementFromEnd.insert(list, 6);
		
		
		nthElementFromEnd.printList(list);
		nthElementFromEnd.printList(rotate(list,k));
	
	}
}
