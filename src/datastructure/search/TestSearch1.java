package datastructure.search;
/**
 * ˳�����
 * T(n) = O(n)
 * S(n) = O(1)
 * @author b1ng0
 *
 */
public class TestSearch1 {

	public static void main(String[] args) {
		//������������
		int [] arr = {89, 45, 78, 45, 100, 98, 86, 100, 65};
		//����Ҫ���ҵķ���
		int key = 100;
		//��ɲ���
		int index = search(arr, key);
		//������
		if(index == -1) {
			System.out.println("�÷��������ڣ�");
		} else {
			System.out.println(key + "�������ǣ�" + index);
		}
	}
	
	public static int search(int [] arr, int key) {
		int index = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				index = i;
				break;
			}
		}
		return index;
	}

}
