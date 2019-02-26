package datastructure.sort;

import java.util.Arrays;
/**
 * ϣ������(���ȶ�)
 * ���ò����������������
 * @author b1ng0
 *
 */
public class ShellSort {
	
	public static void main(String[] args) {
		//������������
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//�����������
		System.out.println(Arrays.toString(arr));
		//ϣ������
		shellSort(arr);
		//�����������
		System.out.println(Arrays.toString(arr));
		
	}

	public static void shellSort(int[] arr) {
		//���ò���
		int gap = arr.length/2; 
		while(gap>0) {
			for(int j=gap; j<arr.length; j++) {
				int i=j;
				//��������
				while(i>=gap && arr[i-gap]>arr[i]) {
					int temp = arr[i-gap] + arr[i];
					arr[i-gap] = temp - arr[i-gap];
					arr[i] = temp - arr[i-gap];
					i -= gap;
				}
			}
			gap = gap/2;
		}
	}
}
