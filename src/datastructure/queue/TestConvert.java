package datastructure.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ʹ��ջ��ʮ����ת���ɶ�����
 * @author b1ng0
 *
 */
public class TestConvert {

	public static void main(String[] args) {
		
		//����һ��ʮ������
		int n = 13;
		
		//��ʮ������ת���ɶ�����
		int t = n;//������
//		String str = "";
		//����һ����ջ
		Deque stack = new LinkedList();
		do {
			//����2����
			int mod = t % 2;
			//�������
//			System.out.println(mod);
//			str = mod + str;
			//��ջ
			stack.push(mod);
//			//����2����
//			int result = t / 2;
//			//������Ϊ������
//			t = result;
			t = t / 2;
			
		} while(t > 0);//����>0
		
		//������
//		System.out.println(n + "------>" + str);
		System.out.print(n + "------>");
		
		while(!stack.isEmpty()) {//��ջ�ǿ�
			//��ջ
			System.out.print(stack.pop());
		}
	}

}