package datastructure.sort;

import java.util.Arrays;
/**
 * ������(���ȶ�)
 * ʱ�临�Ӷ� O(nlogn)
 * �ռ临�Ӷ�O(1)
 * @author b1ng0
 *
 */
public class HeapSort {
	
	public static void main(String[] args) {
		//������������
		int arr[] = {72,6,57,88,60,42,83,73,48,85};
		//�����������
		System.out.println(Arrays.toString(arr));
		//������
		heapSort(arr);
		//�����������
		System.out.println(Arrays.toString(arr));
		
	}

    public static void heapSort(int[] arr) {
        int len = arr.length -1;
        for(int i = len/2 - 1; i >=0; i --){ //�ѹ���
            heapAdjust(arr,i,len);
        }
        while (len >=0){
        	//���Ѷ�Ԫ����β�ڵ㽻���󣬳��ȼ�1��βԪ�����
            swap(arr,0,len--);    
            //�ٴζԶѽ��е���
            heapAdjust(arr,0,len);    
        }
    }
 
    public static void heapAdjust(int[] arr,int i,int len){
    	int left,right,j ;
    	while((left = 2*i+1) <= len){    //�жϵ�ǰ���ڵ�������ڵ㣨�����޺��ӽڵ㣬leftΪ��ڵ㣩
    		right = left + 1;  //�ҽڵ�
    		j = left;   //j"ָ��ָ����ڵ�"
    		//�ҽڵ������ڵ�
    		if(j < len && arr[left] < arr[right])    
    			//��ǰ��"ָ��"ָ���ҽڵ�
    			j ++;     
    		//�����ڵ��뺢�ӽڵ㽻�����������ifΪ�棬��arr[j]Ϊ�ҽڵ㣬���Ϊ��arr[j]��Ϊ��ڵ㣩
    		if(arr[i] < arr[j])    
    			swap(arr,i,j);
    		//˵���Ⱥ��ӽڵ㶼��ֱ������ѭ�����
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
