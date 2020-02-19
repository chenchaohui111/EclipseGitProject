package integerAndString;

import java.awt.List;
import java.util.ArrayList;

public class TestInteger {

	public static void main(String[] args) {
		// 自动拆装箱
		Integer a = 123;// 自动装箱
		int b = a; // 自动拆箱
		System.out.println("a: " + a + " b: " + b);

		// 字符串转数字
		String s = "123";
		int s1 = Integer.parseInt(s);
		double s2 = Double.parseDouble(s);
		System.out.println("s1: " + s1 + " s2: " + s2);
		
		//数字转字符串
		Double c = 123.11;
		double d = 345.11;
		String s3 = c.toString();
//		String s4 = d.toString();//非法
		System.out.println(s3);

	}

}
