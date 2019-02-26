package datastructure.sort;

import java.util.Arrays;
/**
 * 插入排序(稳定)
 * 时间复杂度O(n^2)
 * 空间复杂度O(1)
 * @author b1ng0
 *
 */
public class InsertionSort { 
	
	public static void main(String[] args) {
		//给出无序数组
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//输出无序数组
		System.out.println(Arrays.toString(arr));
		//插入排序
		insertionSort(arr);
		//输出有序数组
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
