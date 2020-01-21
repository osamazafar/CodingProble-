package LinkedList;

public class AddNumber2
{

	public static ListNode add(ListNode l1, ListNode l2)
	{
		ListNode list1 = reverse(l1);
		ListNode list2 = reverse(l2);
		
		ListNode dummy = new ListNode(-1);
		//ListNode result = dummy;
		ListNode node = dummy;
		int carry = 0;
		int sum = 0;
		while(list1 != null || list2 != null)
		{
			int l1Value = list1 != null ? list1.val : 0;
            int l2Value = list2 != null ? list2.val : 0;
            sum = l1Value + l2Value + carry;
            carry = sum / 10;
            node.next = new ListNode(sum%10);
            node = node.next;
            list1 = list1 != null ? list1.next : null;
            list2 = list2 != null ? list2.next : null;
			
		}
		
		if(carry != 0)
		{
			node.next = new ListNode(carry);
		}
		
		
		return reverse(dummy.next);
		
	}
	
	public static ListNode reverse(ListNode head)
	{
		ListNode prev = null;
		
		while(head != null)
		{
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
	
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
