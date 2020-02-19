package integerAndString;

/**
 * 测试 String、StringBuffer、StringBuilder
 * 
 * @author apple
 *
 */

public class TestString {

	public static void main(String[] args) {

		String s = "abc";
		StringBuffer sb1 = new StringBuffer("123");
		StringBuilder sbder = new StringBuilder("EFG");
		StringBuffer sb2 = new StringBuffer(s); // String转换为StringBuffer
		String s1 = sb1.toString(); // StringBuffer转换为String
		String s2 = sbder.toString();//StringBuilder 转 为String
		StringBuilder sbder2 = new StringBuilder(sb1);//Stringbuffer 转 StringBuilder
		System.out.println(sbder2);

	}

}
