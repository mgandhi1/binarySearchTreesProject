public class BSTNode<E extends Comparable<E>> {
	E data;
	BSTNode<E> left;
	BSTNode<E> right;
	
	public BSTNode(E d) {
		left = null;
		right = null;
		data = d;
	}
	
	public BSTNode(E d, BSTNode<E> left, BSTNode<E> right) {
		this.left = left;
		this.right = right;
		data = d;
	}
	
	public void setData(E d) {
		data = d;
	}
	
	public E getData() {
		return data;
	}
	
	public BSTNode<E> getLeft() {
		return left;
	}

	public BSTNode<E> getRight() {
		return right;
	}
	
	public void setLeft(BSTNode<E> node) {
		left = node;
	}
	
	public void setRight(BSTNode<E> node) {
		right = node;
	}
}
