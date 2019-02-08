package datastructure.linetable;

import java.util.Arrays;

//import java.util.ArrayList
/**
 *  ˳���
 *  �ײ���õ����飬���ǳ��ȿ��Զ�̬�仯
 * 
 * java.util.ArrayList ÿ������50%
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
		//�ж�i�Ƿ���ȷ
		if(i<0 || i>size) {
			throw new MyArrayIndexOutOfBoundsException("��������Խ���쳣��" + i);
		}
		
		//����������ˣ�������
		if(size == elementData.length) {
			grow();
		}
		//����i�����Ԫ�أ������һ��Ԫ�ؿ�ʼ
		for(int j=size; j>i; j--) {
			elementData[j] = elementData[j-1];
		}
		
		//������i��λ�ò���Ԫ��e
		elementData[i] = e;
		//���鳤�ȼ�һ
		size++; 
		
	}

	@Override
	public void add(Object e) {
		
		this.add(size, e);
//		//����������ˣ�������
//		if(size == elementData.length) {
//			grow();
//		}
//		//������ĩβ����Ԫ��e
//		elementData[size] = e;
//		//���鳤�ȼ�һ
//		size++; 	
////		elementDate[size++] = e;
	}
	
	//����һ��
	private void grow() {
//		//����һ�������飬�����Ǿ������2��
//		Object[] newArr = new Object[elementData.length*2];
//		//������������ݿ�����������
//		for(int i=0; i < size; i++) {
//			newArr[i] = elementData[i];
//		}
//		//��elementDataָ��������
//		elementData = newArr;
		elementData = Arrays.copyOf(elementData, elementData.length*2);
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
	
	//[123,345,678....]
	@Override
	public String toString() {
		if(size == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		for(int i=0; i<size; i++) {
			if(i != size-1) {
			builder.append(elementData[i] + ", ");
			} else {
				builder.append(elementData[i]);
			}
		}
		builder.append("]");
		return builder.toString();
	}

}
