package LinkedList;

public class AddNumber
{

	
	public static ListNode add(ListNode l1, ListNode l2)
	{
		if(l1 == null || l2 == null)
			return null;
		ListNode result = new ListNode(0);
		ListNode node = result;
		int carry = 0;
		
		while(l1 != null || l2 != null)
		{
			int val = (l1 == null)? 0:l1.val;
			val += (l2 == null)? 0: l2.val;
			val +=carry;
			carry = val/10;
			node.next = new ListNode(val%10);
			node = node.next;
			
			l1 = (l1 != null)?l1.next:null;
			l2 = (l2 != null)? l2.next: null;

		}
		
		if(carry != 0)
			node.next = new ListNode(carry);
		return result.next;
		
	}
	
//	if(l1 == null || l2 == null)
//		return null;
//	ListNode dummy = new ListNode(0);
//	ListNode node = dummy;
//	int carry = 0;
//	
//	while(l1 != null || l2 != null)
//	{
//		int val = (l1 != null)? l1.val:null;
//		val += (l2 != null)? l2.val:null;
//		val +=carry;
//		carry = val/10;
//		val %=10;
//		
//		node.next = new ListNode(val);
//		node = node.next;
//		
//		if(l1 != null) 
//			l1 = l1.next;
//		else
//			l1 = null;
//		if(l2 != null) 
//			l2 = l2.next;
//		else
//			l2 = null;
//		
//	}
//	if(carry != 0)
//		node.next = new ListNode(carry);
//		
//	return dummy.next;

	public static void main(String[] args)
	{
		ListNode l1 = new ListNode(6);
		ListNode l2 = new ListNode(4);
		
		
		MergeTwoList.insert(l1, 4);
		MergeTwoList.insert(l1, 9);
		MergeTwoList.insert(l1, 7);
		MergeTwoList.insert(l1, 8);
		MergeTwoList.printList(l1);
		
		
		MergeTwoList.insert(l2, 3);
		MergeTwoList.insert(l2, 2);
		//MergeTwoList.insert(l2, 2);
		MergeTwoList.printList(l2);
		
		MergeTwoList.printList(add(l1, l2));
		
	}

}
