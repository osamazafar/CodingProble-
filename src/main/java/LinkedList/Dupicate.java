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
		ListNode node = head;
		while(node != null)
		{
			if(node.next == null)
				break;
			if(node.val == node.next.val)
			{
				node.next = node.next.next;
			}
			node = node.next;
		}
		return head.next;
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
