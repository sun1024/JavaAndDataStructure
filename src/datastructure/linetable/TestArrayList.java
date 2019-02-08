package datastructure.linetable;

public class TestArrayList {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(333);
		list.add(133);
		list.add(323);
		list.add(334);
		list.add(345);
		
		list.add(20, 888);
		
		System.out.println(list.size());
//		System.out.println(list.isEmpty());
		System.out.println(list);
	}
}	
