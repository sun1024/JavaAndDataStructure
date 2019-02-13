package datastructure.btree;
/**
 * ��ʽ���������
 * @author b1ng0
 *
 */
public class Node {

	Object value;//���ֵ
	Node leftChild;//������������
	Node rightChild;//������������ 	
	
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
