package datastructure.linetable;
//import java.util.ArrayList
/**
 * 顺序表
 * 底层采用的数组，但是长度可以动态变化
 * @author b1ng0
 *
 */
public class ArrayList implements List{

	private Object[] elementData;//底层是数组
	
	private int size;//数据元素的个数 	
	
	public ArrayList() {
		//没有指定长度,默认长度是4
		this(4);
		//没有指定长度,默认长度是0
//		elementData = new Object[]{};
	}
	
	/**
	 * 
	 * @param initialCapacity 指定数组的初始长度
	 */
	public ArrayList(int initialCapacity) {
		//给数组分配指定数量的空间
		elementData = new Object[initialCapacity];
		//指定顺序表的元素个数，默认是0
//		size=0;
	}
	
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object get(int i) {
		
		if(i<0 || i>=size) {
//			throw new RuntimeException("数组索引越界: " + i);
			throw new MyArrayIndexOutOfBoundsException("数组索引越界: " + i);
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
		//向数组末尾插入元素e
		elementData[size] = e;
		//数组长度加一
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
