package Trees;

public class BinarySearch
{

	
	public  TreeNode insert(TreeNode node, int data)
	{
		if(node == null)
			return (new TreeNode(data));
		else
		{
			if(data <= node.val)
			{
				node.left = insert(node.left, data);
			}
			else
			{
				node.right = insert(node.right, data);
			}
		}
		return node;
	}
	
	 void printPostorder(TreeNode node) 
	    { 
	        if (node == null) 
	            return; 
	  
	        // first recur on left subtree 
	        printPostorder(node.left); 
	  
	        // then recur on right subtree 
	        printPostorder(node.right); 
	  
	        // now deal with the node 
	        System.out.print(node.val + " "); 
	    } 
	
	
	public static void main(String [] args) throws InterruptedException
	{
		BinarySearch tree = new BinarySearch();
		TreeNode root = null;
		root = tree.insert(root, 4);
		tree.insert(root, 2);
		tree.insert(root, 1);
		tree.insert(root, 3); 
        tree.insert(root, 6); 
        tree.insert(root, 5); 
       
	}
}
