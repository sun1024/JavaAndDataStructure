package datastructure.linetable;

public class SingleLinkedList implements List {
	
	private Node head = new Node();//头结点，不存储数据
	
	private int size;//一共有几个结点
	
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object get(int i) {
		//从头结点开始查找
		Node p = head.next;
		for(int j=0; j<i; j++) {
			p = p.next;
		}
		return p.data;
	}

	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}

	@Override
	public boolean contains(Object e) {
		boolean flag = false;
		Node p = head.next;
		for(int j=0; j<size; j++) {
			if(p.data.equals(e)) {
				flag = true;
				break;
			}
			p = p.next;
		}
		return flag;
	}

	@Override
	public int indexOf(Object e) {
		int flag = -1;
		Node p = head.next;
		for(int j=0; j<size; j++) {
			if(p.data.equals(e)) {
				flag = j;
				break;
			}
			p = p.next;
		}
		return flag;
	}

	@Override
	public void add(int i, Object e) {
		//控制i的范围
		if(i<0 || i>size) {
			throw new MyArrayIndexOutOfBoundsException("数组指针越界异常：" + i);
		}
		//找到i的前一个结点，从head结点开始找
		Node p = head;
		for(int j=0; j<i; j++) {
			p = p.next;
		}
		//创建一个新结点
		Node newNode = new Node(e);
		//指明新结点的直接后继结点
		newNode.next = p.next;
		//指明新结点的直接前驱结点
		p.next = newNode;
		
		size++;
		
	}

	@Override
	public void add(Object e) {
		this.add(size, e);
		
	}

	@Override
	public Object remove(int i) {
		//控制i的范围
		if(i<0 || i>=size) {
			throw new MyArrayIndexOutOfBoundsException("数组指针越界异常：" + i);
		}
		//要获取i前一个结点的指针域指向后一个结点，感觉写复杂了orz
		Object tmp = new Object();
		if(i == 0) {
			tmp = head.next.data;
			head.next = head.next.next;
			
		} else {
			Node p = head.next;
			for(int j=0; j<i-1; j++) {
				p = p.next;
			}
			tmp = p.next.data;
			p.next = p.next.next;
		}
		size--;
		return tmp;
	}

	@Override
	public boolean removeObject(Object e) {
		boolean flag = false;
		Node p = head.next;
		for(int j=0; j<size; j++) {
			if(p.data.equals(e)) {
				flag = true;
				this.remove(j);
				break;
			}
			p = p.next;
		}
		
		return flag;
	}

	@Override
	public Object replace(int i, Object e) {
		//控制i的范围
		if(i<0 || i>size) {
			throw new MyArrayIndexOutOfBoundsException("数组指针越界异常：" + i);
		}
		Object rep = remove(i);
		add(i, e);
		return rep;
	}
	
	@Override
	public String toString() {
		if(size == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Node p = head.next;
		for(int i=0; i<size; i++) {
			if(i != size-1) {
			builder.append(p.data + ", ");
			} else {
				builder.append(p.data);
			}
			p = p.next;
		}
		builder.append("]");
		return builder.toString();
	}

}
