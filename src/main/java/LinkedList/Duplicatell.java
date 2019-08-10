package LinkedList;

public class Duplicatell
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
	
	
	public static ListNode duplicate2(ListNode head)
	{
		ListNode dummy = new ListNode(0);
		dummy.next = head;
	
		ListNode prev = dummy;
		ListNode node = prev.next;
		
		while(node != null)
		{
			int count = 0;
			while(node.next != null && node.val == node.next.val)
			{
				count++;
				node = node.next;
			}
			
			if(count == 0)
			{
				prev = prev.next;
			}
			else
			{
				prev.next = node.next;
			}
			
			node = node.next;
		}
		
		return dummy.next;
	}

	public static void main(String[] args)
	{
		ListNode list = new ListNode(0);
		Duplicatell.insert(list, 1);
		Duplicatell.insert(list, 2);
		Duplicatell.insert(list, 2);
		Duplicatell.insert(list, 2);
		Duplicatell.insert(list, 4);
		Duplicatell.insert(list, 6);
		Duplicatell.insert(list, 6);
		//Duplicatell.insert(list, 7);
		printList(list);
		printList(duplicate2(list));
	}

}
