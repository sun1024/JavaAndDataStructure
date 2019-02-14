package datastructure.btree;
/**
 * 二叉树接口
 * @author b1ng0
 *
 */
public interface BinaryTree {
	/**
	 * 是否空树
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * 树结点数量
	 * @return
	 */
	public int size();
	
	/**
	 * 获取二叉树的高度
	 * @return
	 */
	public int getHeight();
	
	/**
	 * 查询指定值的结点
	 * @param value
	 * @return
	 */
	public Node findKey(int value);
	
	/**
	 * 前序递归遍历
	 */
	public void preOrderTraverse();

	/**
	 * 中序递归遍历
	 */
	public void inOrderTraverse();

	/**
	 * 后序递归遍历
	 */
	public void postOrderTraverse();
	
	/**
	 * 后序递归遍历
	 * @param node 树根结点
	 */
	public void postOrderTraverse(Node node);
	
	/**
	 * 先序遍历非递归
	 */
	public void preOrderByStack();
	
	/**
	 * 中序遍历非递归
	 */
	public void inOrderByStack();
	
	/**
	 * 后序遍历非递归
	 */
	public void postOrderByStack();
	
	/**
	 * 按层次遍历
	 */
	public void levelOrderByQueue();
}
