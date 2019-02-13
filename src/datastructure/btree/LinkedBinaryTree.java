package datastructure.btree;
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
		System.out.println("���������ĸ���:");
		
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
		System.out.println("�������ĸ߶�:");
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
		// TODO Auto-generated method stub
		return null;
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
