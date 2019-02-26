package datastructure.sort;

import java.util.Arrays;
/**
 *  ѡ������(���ȶ�)
 * ���ϵ�ѡ��ʣ��Ԫ���е���С��
 *  ʱ�临�Ӷ�O(n^2)
 *  �ռ临�Ӷ�O(1)
 * @author b1ng0
 *
 */
public class SelectionSort {
	
	public static void main(String[] args) {
		//������������
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//�����������
		System.out.println(Arrays.toString(arr));
		//ѡ������
		selectionSort(arr);
		//�����������
		System.out.println(Arrays.toString(arr));
		
	}

	private static void selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			int min_index = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}

}
