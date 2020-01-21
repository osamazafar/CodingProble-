package LinkedList;

public class Palindrome
{

	public static ListNode insert(ListNode head, int data)
	{
		ListNode node = new ListNode(data);
		
		if(head == null)
		{
			head = node;
		}
		else
		{
			ListNode last = head;
			while(last.next != null)
			{
				last = last.next;
			}
			last.next = node;
		}
		return head;
	}
	
	
	public static void printList(ListNode head)
	{
		System.out.print("LinkedList: ");
		while(head != null)
		{
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	//Test Function
	public static boolean palindrom(ListNode head)
	{
		if(head == null || head.next == null)
			return true;
		ListNode slow = head.next;
		ListNode fast = head.next;
		
		while(fast != null && fast.next != null)
		{
			System.out.println("slow: "+slow.val);
			System.out.println("fast: "+fast.val);
			fast = fast.next.next;
			slow = slow.next;
			
		}
		if(fast != null)
		{
			System.out.println("odd: "+slow.val);
			slow = slow.next;
		}
		
		ListNode prev = null;
		while(slow != null)
		{
			ListNode next = slow.next;
			slow.next = prev;
			prev = slow;
			slow = next;
		}
		slow = prev;
		head = head.next;
		while(slow != null)
		{
			if(slow.val != head.val)
				return false;
			else
			{
				slow = slow.next;
				head = head.next;
			}
		}
		
		return true;
		
	}
	
	public static void main(String [] args) 
	{
		ListNode head = new ListNode(0);
		Palindrome.insert(head, 1);
		Palindrome.insert(head, 2);
		Palindrome.insert(head, 3);
		Palindrome.insert(head, 2);
		Palindrome.insert(head, 1);
		printList(head);
		System.out.println(Palindrome.palindrom(head));
	
	}
}
