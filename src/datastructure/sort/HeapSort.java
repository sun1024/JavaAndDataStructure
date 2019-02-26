package datastructure.sort;

import java.util.Arrays;
/**
 * 堆排序(不稳定)
 * 时间复杂度 O(nlogn)
 * 空间复杂度O(1)
 * @author b1ng0
 *
 */
public class HeapSort {
	
	public static void main(String[] args) {
		//给出无序数组
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//输出无序数组
		System.out.println(Arrays.toString(arr));
		//堆排序
		heapSort(arr);
		//输出有序数组
		System.out.println(Arrays.toString(arr));
		
	}

	public static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		
	}
}
