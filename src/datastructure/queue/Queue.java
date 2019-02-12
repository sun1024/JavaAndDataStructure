package datastructure.queue;
/**
 * ����ʵ��
 * queue: �������޵����Ա�
 * �߼��ṹ��һ�˲��� һ��ɾ�� �Ƚ��ȳ�
 * �洢�ṹ��˳����� ����ѭ������ ��ʽ����
 * java��ʹ��˫�˶��У�deque��ʵ��ջ�Ͷ���
 * @author b1ng0
 *
 */
public interface Queue {
	//���ض��еĴ�С
	public int getSize();
	
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty();
	
	//����Ԫ��e���
	public void enqueue(Object e);
	
	//����Ԫ�س���
	public Object dequeue(Object e);
	
	//ȡ����Ԫ��
	public Object peek();
}
