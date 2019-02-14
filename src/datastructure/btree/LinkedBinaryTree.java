package datastructure.btree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 链式二叉树实现
 * @author b1ng0
 *
 */
public class LinkedBinaryTree implements BinaryTree {
	
	private Node root;//根节点
	
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
		System.out.print("二叉树结点的个数:");
		
		return this.size(root);
	}
	
	private int size(Node root) {
		if(root == null) {
			return 0;
		} else {
			//获取左子树结点的个数
			int left = this.size(root.leftChild);
			//获取右子树结点的个数
			int right = this.size(root.rightChild);
			//左+右+1
			return left+right+1;
		}
	}

	@Override
	public int getHeight() {
		System.out.print("二叉树的高度:");
		return this.getHeight(root);
	}
	
	private int getHeight(Node root) {
		if(root == null) {
			return 0;
		} else {
			//获取左子树的高度
			int left = this.getHeight(root.leftChild);
			//获取右子树的高度
			int right = this.getHeight(root.rightChild);
			//返回较大高度+1
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
		System.out.print("先序遍历：");
		this.preOrderTraverse(root);
		System.out.println();
	}
	
	private void preOrderTraverse(Node root) {
		if(root != null) {
			//输出根结点的值
			System.out.print(root.value + "  ");
			//对左子树进行先序遍历
			this.preOrderTraverse(root.leftChild);
		    //对右子树进行先序遍历
			this.preOrderTraverse(root.rightChild);
		}
	}

	@Override
	public void inOrderTraverse() {
		System.out.print("中序遍历：");
		this.inOrderTraverse(root);
		System.out.println();
	}
	
	public void inOrderTraverse(Node root) {
		if(root != null) {
			//对左子树进行中序遍历
			this.inOrderTraverse(root.leftChild);
			//输出根结点
			System.out.print(root.value + "  ");
		    //对右子树进行中序遍历
			this.inOrderTraverse(root.rightChild);
		}
	}	

	@Override
	public void postOrderTraverse() {
		System.out.print("后序遍历：");
		this.postOrderTraverse(root);
		System.out.println();
	}
	
	public void postOrderTraverse(Node root) {
		if(root != null) {
			//对左子树进行后序遍历
			this.postOrderTraverse(root.leftChild);
		    //对右子树进行后序遍历
			this.postOrderTraverse(root.rightChild);
			//输出根结点
			System.out.print(root.value + "  ");
		}
	}	

	@Override
	public void preOrderByStack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inOrderByStack() {
		
		System.out.print("中序非递归遍历：");
		//创建栈
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
		System.out.print("按照层次遍历二叉树：");
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
