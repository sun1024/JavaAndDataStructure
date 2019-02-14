package datastructure.search;
/**
 * 顺序查找
 * T(n) = O(n)
 * S(n) = O(1)
 * @author b1ng0
 *
 */
public class TestSearch1 {

	public static void main(String[] args) {
		//给定分数数组
		int [] arr = {89, 45, 78, 45, 100, 98, 86, 100, 65};
		//给定要查找的分数
		int key = 100;
		//完成查找
		int index = search(arr, key);
		//输出结果
		if(index == -1) {
			System.out.println("该分数不存在！");
		} else {
			System.out.println(key + "的索引是：" + index);
		}
	}
	
	public static int search(int [] arr, int key) {
		int index = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				index = i;
				break;
			}
		}
		return index;
	}

}
