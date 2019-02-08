package datastructure.linetable;

public class TestArrayList {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(333);
		list.add(133);
		list.add(323);
		list.add(334);
		list.add(345);
		
		list.add(2, 888);
		
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
		System.out.println(list);
//		System.out.println(list.contains(344));
//		System.out.println(list.indexOf(345));
//		System.out.println(list.replace(2, 777));
//		System.out.println(list.remove(333));
		System.out.println(list.removeObject(334));
		System.out.println(list);
	}
}	
