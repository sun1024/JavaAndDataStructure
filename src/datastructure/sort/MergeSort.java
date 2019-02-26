package datastructure.sort;

import java.util.Arrays;
/**
 * 归并排序(稳定)
 * 递归 + 合并
 * 时间复杂度 O(nlogn)
 * 空间复杂度O(n) +O(logn)
 * @author b1ng0
 *
 */
public class MergeSort {
	
	public static void main(String[] args) {
		//给出无序数组
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//输出无序数组
		System.out.println(Arrays.toString(arr));
		//归并排序
		mergeSort(arr);
		//输出有序数组
		System.out.println(Arrays.toString(arr));
		
	}

	public static void mergeSort(int[] arr) {
		
		
	}
}
