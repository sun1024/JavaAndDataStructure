package datastructure.search;
/**
 * ���ֲ���
 * ������˳��ṹ����������
 * @author b1ng0
 *
 */
public class TestSearch2 {
	
	public static void main(String[] args) {
		//��������
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//����Ҫ���ҵķ���
		int key = 1;
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
	 * ��ʹ�õݹ�
	 * T(n) = O(logN)
	 * S(n) = O(1)
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int binarySearch(int [] arr, int key) {
		//ָ��low��high
		int low = 0;
		int high = arr.length - 1;
		//����ͷβ�Ż�
		if(key == arr[low]) {
			return low;
		} else if(key == arr[high]){
			return high;
		}
		//���ֲ���
		while(low <= high) {
			//���mid
			int mid = (low + high) / 2;
			//�ж��Ƿ����
			if(key == arr[mid]) {
				return mid;
			} else if(key > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
