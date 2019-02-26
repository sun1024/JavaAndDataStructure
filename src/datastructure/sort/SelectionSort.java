package datastructure.sort;

import java.util.Arrays;
/**
 *  选择排序(不稳定)
 * 不断地选择剩余元素中的最小者
 *  时间复杂度O(n^2)
 *  空间复杂度O(1)
 * @author b1ng0
 *
 */
public class SelectionSort {
	
	public static void main(String[] args) {
		//给出无序数组
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//输出无序数组
		System.out.println(Arrays.toString(arr));
		//选择排序
		selectionSort(arr);
		//输出有序数组
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
