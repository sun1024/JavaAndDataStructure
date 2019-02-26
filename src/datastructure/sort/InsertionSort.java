package datastructure.sort;

import java.util.Arrays;
/**
 * ��������(�ȶ�)
 * ʱ�临�Ӷ�O(n^2)
 * �ռ临�Ӷ�O(1)
 * @author b1ng0
 *
 */
public class InsertionSort { 
	
	public static void main(String[] args) {
		//������������
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//�����������
		System.out.println(Arrays.toString(arr));
		//��������
		insertionSort(arr);
		//�����������
		System.out.println(Arrays.toString(arr));
		
	}

	public static void insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
