package datastructure.sort;

import java.util.Arrays;

/**
 * 快速排序(不稳定)
 * 快排 = 冒泡 + 分治 + 递归
 * 时间复杂度 O(nlogn)
 * 空间复杂度O（logn）
 * @author b1ng0
 *
 */
public class TestQuickSort {
	
	/**
	 * 对arr进行分区操作
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int partition(int[] arr, int low, int high) {
		//指定左指针i和右指针j
		int i = low;
		int j = high;
		//将第一个数作为基准值，挖坑
		int x = arr[low];
		//使用循环实现分区操作
		while(i<j) {
			//1. 从右向左移动j, 找到第一个小于基准值的值
			while(arr[j] >= x && i<j) {
				j--;
			}
			//2. 将找到的数填入i的(坑)位置, i++
			if(i<j) {
				arr[i] = arr[j];
				i++;
			}
			//3. 从左向右移动i, 找到第一个大于等于基准值的值
			while(arr[i] <= x && i<j) {
				i++;
			}
			//4. 将找到的数填入j的位置, j--
			if(i<j) {
				arr[j] = arr[i];
				j--;
			}
		}
		//使用基准值填坑，此即基准值的最终位置
		arr[i] = x; // arr[j] = x;
		//返回基准值的位置索引
		return i;
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {//递归结束条件
			//分区操作，将一个数组分成两个分区，返回分区界限索引
			int index = partition(arr, low, high);
			//对左分区进行快排
			quickSort(arr, low, index-1);
			//对右分区进行快排
			quickSort(arr, index+1, high);
		}
		
	}
	
	public static void quickSort(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		quickSort(arr, low, high);
	}
	
	public static void main(String[] args) {
		//给出无序数组
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//输出无序数组
		System.out.println(Arrays.toString(arr));
		//快速排序
		quickSort(arr);
		//输出有序数组
		System.out.println(Arrays.toString(arr));
		
	}
}
