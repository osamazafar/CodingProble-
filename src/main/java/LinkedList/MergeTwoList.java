package LinkedList;

public class MergeTwoList
{
	
	public static ListNode insert(ListNode list, int data)
	{
		ListNode node = new ListNode(data);
		node.next = null;
		
		if(list == null )
			list = node;
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
	
	
	public static void printList(ListNode list)
	{
		ListNode head = list;
		
		System.out.print("LinkedList:  ");
		while(head != null)
		{
			System.out.print(head.val+" ");
			head = head.next;
		}
	}
	
	
	
	public static ListNode merge(ListNode l1, ListNode l2)
	{
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
		
		while(l1 != null && l2 != null)
		{
			if(l1.val < l2.val)
			{
				head.next = l1;
				l1 = l1.next;
			}
			else
			{
				head.next = l2;
				l2 = l2.next;
			}
			head = head.next;
		}
		
		if(l1 == null)
		{
			head.next = l2;
		}
		
		if(l2 == null)
		{
			head.next = l1;
		}
		
		return dummy.next;
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(-1);
		
		
		MergeTwoList.insert(l1, 1);
		MergeTwoList.insert(l1, 3);
		MergeTwoList.insert(l1, 4);
		MergeTwoList.insert(l1, 8);
		MergeTwoList.printList(l1);
		
		
		MergeTwoList.insert(l2, 2);
		MergeTwoList.insert(l2, 5);
//		MergeTwoList.insert(l2, 7);
//		MergeTwoList.insert(l2, 9);
		MergeTwoList.printList(l2);
		printList(merge(l1,l2));
	}
}
