package datastructure.sort;

import java.util.Arrays;
/**
 * 冒泡排序(稳定)
 * 持续比较相邻元素，将大的挪到后面
 * 时间复杂度O(n^2)
 * 空间复杂度O(1)
 * @author b1ng0
 *
 */
public class TestBubbleSort {

	public static void main(String[] args) {
		//给出无序数组
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//输出无序数组
		System.out.println(Arrays.toString(arr));
		//冒泡排序
		bubbleSort(arr);
		//输出有序数组
		System.out.println(Arrays.toString(arr));
		
	}

	public static void bubbleSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
