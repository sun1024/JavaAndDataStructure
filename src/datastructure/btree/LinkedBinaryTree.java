package datastructure.btree;
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
		System.out.println("二叉树结点的个数:");
		
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
		System.out.println("二叉树的高度:");
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
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postOrderByStack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levelOrderByStack() {
		// TODO Auto-generated method stub
		
	}

}
