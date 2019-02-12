package datastructure.stack;
/**
 * 栈实现
 * stack: 运算受限的线性表
 * 逻辑结构：只能在一端插入删除 后进先出
 *存储结构：顺序栈 链栈 
 * @author b1ng0
 *
 */
public interface Stack {
	//返回堆栈的大小
	public int getSize();
	
	//判断堆栈是否为空
	public boolean isEmpty();
	
	//数据元素e入栈
	public Object push(Object e);
	
	//栈顶元素出栈
	public Object pop();
	
	//取栈顶元素
	public Object peek();
}
