package datastructure.queue;
/**
 * 队列实现
 * queue: 运算受限的线性表
 * 逻辑结构：一端插入 一端删除 先进先出
 * 存储结构：顺序队列 采用循环数组 链式队列
 * java中使用双端队列（deque）实现栈和队列
 * @author b1ng0
 *
 */
public interface Queue {
	//返回队列的大小
	public int getSize();
	
	//判断队列是否为空
	public boolean isEmpty();
	
	//数据元素e入队
	public void enqueue(Object e);
	
	//队首元素出队
	public Object dequeue(Object e);
	
	//取队首元素
	public Object peek();
}
