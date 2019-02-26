package datastructure.sort;

import java.util.Arrays;
/**
 * 希尔排序(不稳定)
 * 设置步长，分组插入排序
 * @author b1ng0
 *
 */
public class ShellSort {
	
	public static void main(String[] args) {
		//给出无序数组
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//输出无序数组
		System.out.println(Arrays.toString(arr));
		//希尔排序
		shellSort(arr);
		//输出有序数组
		System.out.println(Arrays.toString(arr));
		
	}

	public static void shellSort(int[] arr) {
		//设置步长
		int gap = arr.length/2; 
		while(gap>0) {
			for(int j=gap; j<arr.length; j++) {
				int i=j;
				//插入排序
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
