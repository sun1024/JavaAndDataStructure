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
        int len = arr.length -1;
        for(int i = len/2 - 1; i >=0; i --){ //堆构造
            heapAdjust(arr,i,len);
        }
        while (len >=0){
        	//将堆顶元素与尾节点交换后，长度减1，尾元素最大
            swap(arr,0,len--);    
            //再次对堆进行调整
            heapAdjust(arr,0,len);    
        }
    }
 
    public static void heapAdjust(int[] arr,int i,int len){
    	int left,right,j ;
    	while((left = 2*i+1) <= len){    //判断当前父节点有无左节点（即有无孩子节点，left为左节点）
    		right = left + 1;  //右节点
    		j = left;   //j"指针指向左节点"
    		//右节点大于左节点
    		if(j < len && arr[left] < arr[right])    
    			//当前把"指针"指向右节点
    			j ++;     
    		//将父节点与孩子节点交换（如果上面if为真，则arr[j]为右节点，如果为假arr[j]则为左节点）
    		if(arr[i] < arr[j])    
    			swap(arr,i,j);
    		//说明比孩子节点都大，直接跳出循环语句
    		else         
    			break;
    		i = j;
    	}
    }
    
    public static void swap(int[] arr,int i,int len){
             
    	int temp = arr[i];
        arr[i] = arr[len];
        arr[len] = temp;
    }

}
