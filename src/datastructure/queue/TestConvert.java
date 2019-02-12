package datastructure.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 使用栈将十进制转换成二进制
 * @author b1ng0
 *
 */
public class TestConvert {

	public static void main(String[] args) {
		
		//给定一个十进制数
		int n = 13;
		
		//把十进制数转换成二进制
		int t = n;//被除数
//		String str = "";
		//定义一个空栈
		Deque stack = new LinkedList();
		do {
			//除以2求余
			int mod = t % 2;
			//输出余数
//			System.out.println(mod);
//			str = mod + str;
			//入栈
			stack.push(mod);
//			//除以2求商
//			int result = t / 2;
//			//将商作为被除数
//			t = result;
			t = t / 2;
			
		} while(t > 0);//当商>0
		
		//输出结果
//		System.out.println(n + "------>" + str);
		System.out.print(n + "------>");
		
		while(!stack.isEmpty()) {//当栈非空
			//出栈
			System.out.print(stack.pop());
		}
	}

}