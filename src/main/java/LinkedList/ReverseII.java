package LinkedList;

public class ReverseII
{

	//Iteraytive Solution with Nodes direction changes
	public static ListNode reverse(ListNode head, int m, int n)
	{
		ListNode curr = head;
		ListNode prev = null;
		
		while(m > 1)
		{
			prev = curr;
			curr = curr.next;
			m--;
			n--;
		}
		
		ListNode con = prev; ListNode tail = curr;
		
		
		ListNode third = null;
		
		while(n > 0)
		{
			third = curr.next;
			curr.next = prev;
			prev = curr;
			curr = third;
			n--;
		}
	
		if(con != null)
			con.next = prev;
		else
			head = prev;
		
		tail.next = curr;
		return head;
			
	}
	
	
	
	
	
	
	
	//Recursive Solution Completed
	
	

	private static ListNode left;
	private static boolean found;
	
	public static void recuseAndReverse(ListNode right, int m, int n)
	{
		if(n == 1)
			return;
		right = right.next;
		
		if(m > 1)
		{
			left = left.next;
		}
		
		recuseAndReverse(right, m-1, n-1);
		
		if(left == right || right.next == left)
			found = true;
		if(!found)
		{
			int temp = left.val;
			left.val = right.val;
			right.val = temp;
			
			left = left.next;
		}
		
	}
	
	public static ListNode reverse2(ListNode head, int m, int n)
	{
		left = head;
		found = false;
		recuseAndReverse(head, m, n);
		return head;
	}

	public static void main(String[] args)
	{
		ListNode list = new ListNode(0);

		int m = 3, n = 7;

		nthElementFromEnd.insert(list, 9);
		nthElementFromEnd.insert(list, 2);
		nthElementFromEnd.insert(list, 7);
		nthElementFromEnd.insert(list, 4);
		nthElementFromEnd.insert(list, 5);
		nthElementFromEnd.insert(list, 6);
		nthElementFromEnd.insert(list, 8);
		nthElementFromEnd.insert(list, 3);
		nthElementFromEnd.insert(list, 1);
		nthElementFromEnd.insert(list, 10);
		
		nthElementFromEnd.printList(list);
		// nthElementFromEnd.printList(reverse2(list, m, n));
		
		nthElementFromEnd.printList(reverse(list, m, n));
		System.out.println(" ");
		//nthElementFromEnd.printList(reverse2(list, m, n));
	
	}

}
