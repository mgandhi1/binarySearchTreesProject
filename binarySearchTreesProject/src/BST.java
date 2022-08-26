public class BST<E extends Comparable<E>> {
	private BSTNode<E> root;
	private int size;
	
	public BST() {
		root = null;
		size = 0;
	}
	
	
	//insert 1
	//find 1 
	//toString 1
	//countLeaves 1 
	// remove 1
	
	
	//add the parameter value to the tree
	public void insert(E value) {
		root = insert(root, value);
		size++;
	}
	

	private BSTNode<E> insert(BSTNode<E> rt, E value) {
		if (rt == null) {
			return new BSTNode<E>(value);
		}
		if (rt.data.compareTo(value) == 0) // 
		{
			return rt;
		}
		if(rt.data.compareTo(value) > 0 ) 
		{
			rt.left = insert(rt.left, value);
		}
		else
		{
			rt.right = insert(rt.right, value);
		}
		return rt;
	}
	
	
	
	//perform an inorder traversal of the tree
	public void inorder() {
		inorder(root);
	}
	
	//helper method for inorder
	private void inorder(BSTNode<E> rt) {
		if(rt == null)
		{
			return;
		}
		else
		{
			inorder(rt.getLeft());
			System.out.println(rt.getData());
			inorder(rt.getRight());
		}
	}
	
	

	
	//return an int of the number of leaves this tree contains.
	int countLeaves() 
	{
		return countLeaves(root);
	}
	
	//helper method for countLeaves
	 int countLeaves(BSTNode<E> rt){
		if(rt == null)
		{
			return 0;
		}
		else if(rt.left == null && rt.right == null)
		{
//			System.out.println("number of leaves: 1 ");
			return 1;
		}
		else 
		{
			//System.out.println("number of leaves:" + rt.left + rt.right);
			return countLeaves(rt.left) + countLeaves(rt.right);
//			int leftNodes = countLeaves(rt.left);
//			int rightNodes = countLeaves(rt.right);
//			return leftNodes + rightNodes;
		}
		// tester syntax: System.out.println("number of leaves: " + tree.countLeaves());
	}
	
	
	
	
	//Find and return value if it exists in the tree.
	//Return null if it is not present.
	public boolean find(E value) 
	{
		return find(root, value);
	}
	
	//helper method for find
	private boolean find(BSTNode<E> rt, E value) 
	{		
		if(rt == null)
		{
			return false;
			//throw new NullPointerException("NPE Thrown: null value");
		}
		else if(value.compareTo(rt.getData()) == 0)
		{
			return true;
		}
		else if(value.compareTo(rt.getData()) == 0)
		{
			return find(rt.left, value);
		}
		else
		{
			return find(rt.right, value);
		}
		
//		int compare = value.compareTo(rt.getData());
//		if(compare <0)
//		{
//			return find(rt.left, value);
//		}
//		else if (compare > 0)
//		{
//			return find(rt.right, value);
//		}
//		else
//		{
//			return rt.getData();
//		}
	}
	

	
	// create a string to store concatenated string 
	public String toString()
	{
		String tmp = "";
		tmp = toString(root, "");
		return tmp;
	}
	private String toString(BSTNode<E>rt, String str)
	{
		if(root == null)
		{
			return "";
		}
		else
		{
			toString(rt.getLeft(), str);
			String returnStr = str + " " + rt.getData();
			toString(rt.getRight(), returnStr);
			return returnStr;
		}
//		if (rt == null)
//		{
//			return "";
//		}
//		else 
//		{
//			toString(rt.getLeft());
//			System.out.println(rt.getData());
//			toString(rt.getRight());
//		}
	}
	
	

	// remove method: remove node 
	public void remove(E value)
	{
		root = remove(root, value);
	}
	private BSTNode<E> remove(BSTNode<E> rt, E value)
	{
		if (rt == null)
		{
			return null;
		}
		else if(value.compareTo(rt.data) < 0)
	    {
			rt.left = remove(rt.left, value); 
	    }
	    else if(value.compareTo(rt.data) > 0)
	    {
	    	rt.right = remove(rt.right, value);  
	    }
	    else
	    {
	    	if(rt.left == null)
	    	{
	        	//rt.getLeft().getData();
	    		System.out.println(rt.right);
	    		return rt.right;
	        }
	        else if(rt.right == null)
	        {
	        	System.out.println(rt.left);
	        	return rt.left;
	        }
	        else
	        {
	        	if(rt.right != null)
	        	{
	        		rt = rt.right;
	        	}
	        	rt.data = rtGetDataMethod(rt.left);
	        	rt.left = remove(rt.left, rt.data);
	        }
	    }
		System.out.println(rt);
	    return rt;     
	}
	// helper method for remove
	private E rtGetDataMethod(BSTNode<E> rt)
	{
		while(rt != null)
		{
			rt = rt.right;
		}
		return rt.data;
	 }	 
}