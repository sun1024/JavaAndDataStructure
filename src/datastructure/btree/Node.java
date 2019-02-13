package datastructure.btree;
/**
 * 链式二叉树结点
 * @author b1ng0
 *
 */
public class Node {

	Object value;//结点值
	Node leftChild;//左子树的引用
	Node rightChild;//右子树的引用 	
	
	public Node(int value) {
		this.value = value;
	}
	
	public Node(int value, Node leftChild, Node rightChild) {
		super();
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}
	
	
}
