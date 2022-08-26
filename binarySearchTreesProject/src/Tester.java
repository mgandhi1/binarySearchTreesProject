public class Tester {

	public static void main(String[]args)
	{
		BST<Integer> tree = new BST<Integer>();
//		tree.insert("cantelope");
//		tree.insert("elderberry");
//		tree.insert("bannana");
//		tree.insert("durian");
//		tree.insert("fig");
//		tree.insert("apple");
//		
//		tree.insert("bpple");
//		tree.insert("bqple");
//		tree.insert("bqplf");
		
		tree.insert(10);
		tree.insert(5);
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
        tree.insert(25);
        tree.insert(1);
        tree.insert(6);
        tree.insert(50);
        tree.insert(70);
        
//		tree.root = new Node(1); 
//        tree.root.left = new Node(2); 
//        tree.root.right = new Node(3); 
//        tree.root.left.left = new Node(4); 
//        tree.root.left.right = new Node(5); 
		
		
		
		
		
		tree.inorder();
		tree.insert(3333);
		tree.find(3);
		//tree.toString();
		tree.countLeaves();
		System.out.println("number of leaves: " + tree.countLeaves());
		//tree.remove(5);
		
		
		
		/*
		BSTNode<String> a = new BSTNode<String>("apple");
		BSTNode<String> b = new BSTNode<String>("bannana");
		BSTNode<String> c = new BSTNode<String>("cantelope");
		BSTNode<String> d = new BSTNode<String>("durian");
		BSTNode<String> e = new BSTNode<String>("elderberry");
		BSTNode<String> f = new BSTNode<String>("fig");
		
		c.setLeft(a);;
		a.setRight(b);
		c.setRight(e);
		e.setLeft(d);
		e.setRight(f);
		
		inorder(c);
		
	*/	
	}
}



//their success has led to massive overhead that makes it difficult for them to be nimble