package datastructure.linetable;
//import java.util.ArrayList
/**
 * ˳���
 * �ײ���õ����飬���ǳ��ȿ��Զ�̬�仯
 * @author b1ng0
 *
 */
public class ArrayList implements List{

	private Object[] elementData;//�ײ�������
	
	private int size;//����Ԫ�صĸ��� 	
	
	public ArrayList() {
		//û��ָ������,Ĭ�ϳ�����4
		this(4);
		//û��ָ������,Ĭ�ϳ�����0
//		elementData = new Object[]{};
	}
	
	/**
	 * 
	 * @param initialCapacity ָ������ĳ�ʼ����
	 */
	public ArrayList(int initialCapacity) {
		//���������ָ�������Ŀռ�
		elementData = new Object[initialCapacity];
		//ָ��˳����Ԫ�ظ�����Ĭ����0
//		size=0;
	}
	
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object get(int i) {
		
		if(i<0 || i>=size) {
//			throw new RuntimeException("��������Խ��: " + i);
			throw new MyArrayIndexOutOfBoundsException("��������Խ��: " + i);
		}
		
		return elementData[i];
	}

	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}

	@Override
	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(int i, Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Object e) {
		//������ĩβ����Ԫ��e
		elementData[size] = e;
		//���鳤�ȼ�һ
		size++; 	
//		elementDate[size++] = e;
	}

	@Override
	public void addBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		// TODO Auto-generated method stub
		return null;
	}

}
