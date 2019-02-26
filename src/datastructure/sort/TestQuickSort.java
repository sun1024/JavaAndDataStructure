package datastructure.sort;

import java.util.Arrays;

/**
 * ��������(���ȶ�)
 * ���� = ð�� + ���� + �ݹ�
 * ʱ�临�Ӷ� O(nlogn)
 * �ռ临�Ӷ�O��logn��
 * @author b1ng0
 *
 */
public class TestQuickSort {
	
	/**
	 * ��arr���з�������
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int partition(int[] arr, int low, int high) {
		//ָ����ָ��i����ָ��j
		int i = low;
		int j = high;
		//����һ������Ϊ��׼ֵ���ڿ�
		int x = arr[low];
		//ʹ��ѭ��ʵ�ַ�������
		while(i<j) {
			//1. ���������ƶ�j, �ҵ���һ��С�ڻ�׼ֵ��ֵ
			while(arr[j] >= x && i<j) {
				j--;
			}
			//2. ���ҵ���������i��(��)λ��, i++
			if(i<j) {
				arr[i] = arr[j];
				i++;
			}
			//3. ���������ƶ�i, �ҵ���һ�����ڵ��ڻ�׼ֵ��ֵ
			while(arr[i] <= x && i<j) {
				i++;
			}
			//4. ���ҵ���������j��λ��, j--
			if(i<j) {
				arr[j] = arr[i];
				j--;
			}
		}
		//ʹ�û�׼ֵ��ӣ��˼���׼ֵ������λ��
		arr[i] = x; // arr[j] = x;
		//���ػ�׼ֵ��λ������
		return i;
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {//�ݹ��������
			//������������һ������ֳ��������������ط�����������
			int index = partition(arr, low, high);
			//����������п���
			quickSort(arr, low, index-1);
			//���ҷ������п���
			quickSort(arr, index+1, high);
		}
		
	}
	
	public static void quickSort(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		quickSort(arr, low, high);
	}
	
	public static void main(String[] args) {
		//������������
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//�����������
		System.out.println(Arrays.toString(arr));
		//��������
		quickSort(arr);
		//�����������
		System.out.println(Arrays.toString(arr));
		
	}
}
