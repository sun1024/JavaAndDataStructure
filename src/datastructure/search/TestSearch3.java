package datastructure.search;
/**
 * ���ֲ���
 * ������˳��ṹ����������
 * @author b1ng0
 *
 */
public class TestSearch3 {
	
	public static void main(String[] args) {
		//��������
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//����Ҫ���ҵķ���
		int key = 11;
		//��ɲ���
		int index = binarySearch(arr, key);
		//������
		if(index == -1) {
			System.out.println("�����ڣ�");
		} else {
			System.out.println(key + "�������ǣ�" + index);
		}
	}

	/**
	 * ʹ�õݹ�
	 * T(n) = O(logN)
	 * S(n) = O(logN)
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int binarySearch(int [] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		return binarySearch(arr, key, high, low);
	}
	
	public static int binarySearch(int [] arr, int key, int high, int low) {
		int mid = (low + high) / 2;
		//�ݹ���ֹ����
		if(low > high) {
			return -1;
		} else if(key == arr[mid]){
			return mid;
		} else if(key > arr[mid]) {
			return binarySearch(arr, key, high, low=mid+1);
		} else {
			return binarySearch(arr, key, high=mid-1, low);
		}
	}
}
