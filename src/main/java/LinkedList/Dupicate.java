package LinkedList;

public class Dupicate
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
	
	
	public static ListNode duplicate(ListNode head)
	{
		if(head == null)
			return null;
		ListNode dummy = new ListNode(0);
		ListNode node = dummy;
		while(head != null)
		{
			if(head.next == null)
				break;
			if(head.val == head.next.val)
			{
				node.next = new ListNode(head.val);
				node = node.next;
				head.next = head.next.next;
			}
			head = head.next;
			
		}
		return dummy.next;
	}
	
	

	public static void main(String[] args)
	{
		
		ListNode list = new ListNode(0);
	
		
		nthElementFromEnd.insert(list, 1);
		nthElementFromEnd.insert(list, 2);
		nthElementFromEnd.insert(list, 2);
		nthElementFromEnd.insert(list, 4);
		nthElementFromEnd.insert(list, 4);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.printList(list);
		printList(duplicate(list));
		

	}

}
