package datastructure.btree;
/**
 * �������ӿ�
 * @author b1ng0
 *
 */
public interface BinaryTree {
	/**
	 * �Ƿ����
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * ���������
	 * @return
	 */
	public int size();
	
	/**
	 * ��ȡ�������ĸ߶�
	 * @return
	 */
	public int getHeight();
	
	/**
	 * ��ѯָ��ֵ�Ľ��
	 * @param value
	 * @return
	 */
	public Node findKey(int value);
	
	/**
	 * ǰ��ݹ����
	 */
	public void preOrderTraverse();

	/**
	 * ����ݹ����
	 */
	public void inOrderTraverse();

	/**
	 * ����ݹ����
	 */
	public void postOrderTraverse();
	
	/**
	 * ����ݹ����
	 * @param node �������
	 */
	public void postOrderTraverse(Node node);
	
	/**
	 * ��������ǵݹ�
	 */
	public void preOrderByStack();
	
	/**
	 * ��������ǵݹ�
	 */
	public void inOrderByStack();
	
	/**
	 * ��������ǵݹ�
	 */
	public void postOrderByStack();
	
	/**
	 * ����α���
	 */
	public void levelOrderByQueue();
}
