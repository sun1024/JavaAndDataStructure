package datastructure.sort;

import java.util.Arrays;
/**
 * �鲢����(�ȶ�)
 * �ݹ�  + �ϲ�
 * ʱ�临�Ӷ� O(nlogn)
 * �ռ临�Ӷ�O(n) +O(logn)
 * @author b1ng0
 *
 */
public class MergeSort {
	
	public static void main(String[] args) {
		//������������
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//�����������
		System.out.println(Arrays.toString(arr));
		//�鲢����
		mergeSort(arr);
		//�����������
		System.out.println(Arrays.toString(arr));
		
	}

	public static void mergeSort(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		mergeSort(arr, low, high);
	}

	private static void mergeSort(int[] arr, int low, int high) {
		
		if(low<high) {
			int mid = (low + high) / 2;
			//����ߵ�������еݹ�����
			mergeSort(arr, low, mid);
			//���ұߵ�������еݹ�����
			mergeSort(arr, mid+1, high);
			//�ϲ����������������
			mergeArr(arr, low, mid, high);
		}
	}

	private static void mergeArr(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// ��ָ��
        int j = mid + 1;// ��ָ��
        int k = 0;
        // �ѽ�С�������Ƶ���������
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // �����ʣ�������������
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // ���ұ߱�ʣ�������������
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        // ���������е�������arr��
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[k2 + low] = temp[k2];
        }
			
	}

}
