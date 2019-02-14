package datastructure.btree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ��ʽ������ʵ��
 * @author b1ng0
 *
 */
public class LinkedBinaryTree implements BinaryTree {
	
	private Node root;//���ڵ�
	
	public LinkedBinaryTree(Node root) {
		super();
		this.root = root;
	}

	public LinkedBinaryTree() {
		super();
	}

	@Override
	public boolean isEmpty() {

		return root == null;
	}

	@Override
	public int size() {
		System.out.print("���������ĸ���:");
		
		return this.size(root);
	}
	
	private int size(Node root) {
		if(root == null) {
			return 0;
		} else {
			//��ȡ���������ĸ���
			int left = this.size(root.leftChild);
			//��ȡ���������ĸ���
			int right = this.size(root.rightChild);
			//��+��+1
			return left+right+1;
		}
	}

	@Override
	public int getHeight() {
		System.out.print("�������ĸ߶�:");
		return this.getHeight(root);
	}
	
	private int getHeight(Node root) {
		if(root == null) {
			return 0;
		} else {
			//��ȡ�������ĸ߶�
			int left = this.getHeight(root.leftChild);
			//��ȡ�������ĸ߶�
			int right = this.getHeight(root.rightChild);
			//���ؽϴ�߶�+1
			return left>=right ? left+1 : right+1;
		}
	}

	@Override
	public Node findKey(int value) {
		
		return this.findkey(value, root);
	}
	
	private Node findkey(Object value, Node root) {
		if(root == null) {
			return null;
		} else if(root != null && root.value == value) {
			return root;
		} else {
			Node nodeL = this.findkey(value, root.leftChild);
			Node nodeR = this.findkey(value, root.rightChild);
			if(nodeL != null && nodeL.value == value) {
				return nodeL;
			} else if(nodeR != null && nodeR.value == value){
				return nodeR;
			} else {
				return null;
			}
		}
	}
	
	@Override
	public void preOrderTraverse() {
		System.out.print("���������");
		this.preOrderTraverse(root);
		System.out.println();
	}
	
	private void preOrderTraverse(Node root) {
		if(root != null) {
			//���������ֵ
			System.out.print(root.value + "  ");
			//�������������������
			this.preOrderTraverse(root.leftChild);
		    //�������������������
			this.preOrderTraverse(root.rightChild);
		}
	}

	@Override
	public void inOrderTraverse() {
		System.out.print("���������");
		this.inOrderTraverse(root);
		System.out.println();
	}
	
	public void inOrderTraverse(Node root) {
		if(root != null) {
			//�������������������
			this.inOrderTraverse(root.leftChild);
			//��������
			System.out.print(root.value + "  ");
		    //�������������������
			this.inOrderTraverse(root.rightChild);
		}
	}	

	@Override
	public void postOrderTraverse() {
		System.out.print("���������");
		this.postOrderTraverse(root);
		System.out.println();
	}
	
	public void postOrderTraverse(Node root) {
		if(root != null) {
			//�����������к������
			this.postOrderTraverse(root.leftChild);
		    //�����������к������
			this.postOrderTraverse(root.rightChild);
			//��������
			System.out.print(root.value + "  ");
		}
	}	

	@Override
	public void preOrderByStack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inOrderByStack() {
		
		System.out.print("����ǵݹ������");
		//����ջ
		Deque<Node> stack = new LinkedList<Node>();
		Node current = root;
		while(current != null || !stack.isEmpty()) {
			while(current != null) {
				stack.push(current);
				current = current.leftChild;
			}
			
			if(!stack.isEmpty()) {
				current = stack.pop();
				System.out.print(current.value + "  ");
				current = current.rightChild;
			}
		}
		System.out.println();
	}

	@Override
	public void postOrderByStack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levelOrderByQueue() {
		System.out.print("���ղ�α�����������");
		if(root == null) return;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(queue.size() != 0) {
			int len = queue.size();
			for(int i=0; i<len; i++) {
				Node temp = queue.poll();
				System.out.print(temp.value+"  ");
				if(temp.leftChild != null) queue.add(temp.leftChild);
				if(temp.rightChild != null) queue.add(temp.rightChild);
			}
		}
		System.out.println();
	}

}
