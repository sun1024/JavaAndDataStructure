package datastructure.search;
/**
 * 二分查找
 * 条件：顺序结构、有序排列
 * @author b1ng0
 *
 */
public class TestSearch2 {
	
	public static void main(String[] args) {
		//给定数组
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//给定要查找的分数
		int key = 1;
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
	 * 不使用递归
	 * T(n) = O(logN)
	 * S(n) = O(1)
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int binarySearch(int [] arr, int key) {
		//指定low和high
		int low = 0;
		int high = arr.length - 1;
		//对于头尾优化
		if(key == arr[low]) {
			return low;
		} else if(key == arr[high]){
			return high;
		}
		//二分查找
		while(low <= high) {
			//求得mid
			int mid = (low + high) / 2;
			//判断是否等于
			if(key == arr[mid]) {
				return mid;
			} else if(key > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
