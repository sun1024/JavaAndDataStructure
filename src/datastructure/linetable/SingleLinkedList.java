package datastructure.linetable;

public class SingleLinkedList implements List {
	
	private Node head = new Node();//ͷ��㣬���洢����
	
	private int size;//һ���м������
	
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object get(int i) {
		//��ͷ��㿪ʼ����
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
		//����i�ķ�Χ
		if(i<0 || i>size) {
			throw new MyArrayIndexOutOfBoundsException("����ָ��Խ���쳣��" + i);
		}
		//�ҵ�i��ǰһ����㣬��head��㿪ʼ��
		Node p = head;
		for(int j=0; j<i; j++) {
			p = p.next;
		}
		//����һ���½��
		Node newNode = new Node(e);
		//ָ���½���ֱ�Ӻ�̽��
		newNode.next = p.next;
		//ָ���½���ֱ��ǰ�����
		p.next = newNode;
		
		size++;
		
	}

	@Override
	public void add(Object e) {
		this.add(size, e);
		
	}

	@Override
	public Object remove(int i) {
		//����i�ķ�Χ
		if(i<0 || i>=size) {
			throw new MyArrayIndexOutOfBoundsException("����ָ��Խ���쳣��" + i);
		}
		//Ҫ��ȡiǰһ������ָ����ָ���һ����㣬�о�д������orz
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
		//����i�ķ�Χ
		if(i<0 || i>size) {
			throw new MyArrayIndexOutOfBoundsException("����ָ��Խ���쳣��" + i);
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
