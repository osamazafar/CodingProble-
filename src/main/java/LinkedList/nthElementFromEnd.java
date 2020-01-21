package LinkedList;

public class nthElementFromEnd
{
	
	public static ListNode insert(ListNode list, int data)
	{
		ListNode node = new ListNode(data);
		node.next = null;
		
		if(list == null)
		{
			list = node;
		}
		else
		{
			ListNode last = list;
			while(last.next != null)
			{
				last = last.next;
			}
			last.next = node;
		}
		return list;
	}
	
	
	public static void printList(ListNode head)
	{
		ListNode node = head;
		System.out.print("LinkedList:  ");
		while(node != null)
		{
			System.out.print(node.val+" ");
			node = node.next;
		}
	}
	
	
	public static ListNode removekthElement(ListNode head, int k)
	{
		int len = 0;
		//ListNode dummy = new ListNode(0);
       // dummy.next = head;
		ListNode node = head;
		while(node != null)
		{
			len++;
			node = node.next;
		}
		
		len -=k;
		node = head;
		while(len-1 > 0)
		{
			len--;
			node = node.next;
		}
		node.next = node.next.next;
		return head.next;
	}
	
	
	public static void main(String [] args) 
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
		printList(removekthElement(list, k));
	}
}
