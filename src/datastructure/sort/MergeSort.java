package datastructure.sort;

import java.util.Arrays;
/**
 * 归并排序(稳定)
 * 递归  + 合并
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
		int low = 0;
		int high = arr.length - 1;
		mergeSort(arr, low, high);
	}

	private static void mergeSort(int[] arr, int low, int high) {
		
		if(low<high) {
			int mid = (low + high) / 2;
			//对左边的数组进行递归排序
			mergeSort(arr, low, mid);
			//对右边的数组进行递归排序
			mergeSort(arr, mid+1, high);
			//合并两个已排序的数组
			mergeArr(arr, low, mid, high);
		}
	}

	private static void mergeArr(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        // 把新数组中的数覆盖arr组
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[k2 + low] = temp[k2];
        }
			
	}

}
