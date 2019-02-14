package datastructure.search;
/**
 * 二分查找
 * 条件：顺序结构、有序排列
 * @author b1ng0
 *
 */
public class TestSearch3 {
	
	public static void main(String[] args) {
		//给定数组
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//给定要查找的分数
		int key = 11;
		//完成查找
		int index = binarySearch(arr, key);
		//输出结果
		if(index == -1) {
			System.out.println("不存在！");
		} else {
			System.out.println(key + "的索引是：" + index);
		}
	}

	/**
	 * 使用递归
	 * T(n) = O(logN)
	 * S(n) = O(logN)
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int binarySearch(int [] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		return binarySearch(arr, key, high, low);
	}
	
	public static int binarySearch(int [] arr, int key, int high, int low) {
		int mid = (low + high) / 2;
		//递归终止条件
		if(low > high) {
			return -1;
		} else if(key == arr[mid]){
			return mid;
		} else if(key > arr[mid]) {
			return binarySearch(arr, key, high, low=mid+1);
		} else {
			return binarySearch(arr, key, high=mid-1, low);
		}
	}
}
