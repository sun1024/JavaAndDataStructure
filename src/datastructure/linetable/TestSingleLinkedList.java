package datastructure.linetable;

public class TestSingleLinkedList {
	
	public static void main(String[] args) {
		List list = new SingleLinkedList();
		
		list.add(333);
		list.add(133);
		list.add(323);
		list.add(334);
		list.add(345);
		
		list.add(2, 888);
		
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
//		System.out.println(list.get(0));
		System.out.println(list);
//		System.out.println(list.contains(334));
//		System.out.println(list.indexOf(888));
		System.out.println(list.replace(6, 777));
//		System.out.println(list.remove(5));
//		System.out.println(list.removeObject(345));
		System.out.println(list);
	}
}	
