package LinkedList;

public class AddNumber
{
	
	
	public static ListNode add(ListNode l1, ListNode l2)
	{
		if(l1 == null || l2 == null)
			return null;
		ListNode dummy = new ListNode(0);
		ListNode node = dummy;
		int carry = 0;
		
		while(l1 != null || l2 != null)
		{
			int val = (l1 != null)? l1.val:null;
			val += (l2 != null)? l2.val:null;
			val +=carry;
			carry = val/10;
			val %=10;
			
			node.next = new ListNode(val);
			node = node.next;
			
			if(l1 != null) 
				l1 = l1.next;
			else
				l1 = null;
			if(l2 != null) 
				l2 = l2.next;
			else
				l2 = null;
			
		}
		if(carry != 0)
			node.next = new ListNode(carry);
			
		return dummy.next;
		
		
	}

	public static void main(String[] args)
	{
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);
		
		
		MergeTwoList.insert(l1, 4);
		MergeTwoList.insert(l1, 5);
		MergeTwoList.insert(l1, 4);
		MergeTwoList.printList(l1);
		
		
		MergeTwoList.insert(l2, 5);
		MergeTwoList.insert(l2, 6);
		MergeTwoList.insert(l2, 4);
		MergeTwoList.printList(l2);
		
		MergeTwoList.printList(add(l1, l2));
		
	}

}
