package datastructure.stack;
/**
 * ջʵ��
 * stack: �������޵����Ա�
 * �߼��ṹ��ֻ����һ�˲���ɾ�� ����ȳ�
 *�洢�ṹ��˳��ջ ��ջ 
 * @author b1ng0
 *
 */
public interface Stack {
	//���ض�ջ�Ĵ�С
	public int getSize();
	
	//�ж϶�ջ�Ƿ�Ϊ��
	public boolean isEmpty();
	
	//����Ԫ��e��ջ
	public Object push(Object e);
	
	//ջ��Ԫ�س�ջ
	public Object pop();
	
	//ȡջ��Ԫ��
	public Object peek();
}
