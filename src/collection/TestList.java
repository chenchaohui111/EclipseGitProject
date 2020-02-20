package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
//123
public class TestList {
	/**
	 * List 特点：①有序 ②可重复
	 * 
	 * 使用哪个？
	 * 唯一吗？
	 *     否：List
	 *     要安全吗?
	 *          是：Vector
	 *          否：ArrayList或者LinkedList
	 *               查询多：ArrayList
	 *               增删多：LinkedList
	 * 总之: 如果你知道是List，但是不知道是哪个List，就用ArrayList。
	 */
	public static void main(String[] args) {
		/**
		 * ArrayList 
		 * 优点：底层数据结构是数组，查询快，增删慢。 
		 * 缺点：线程不安全，效率高
		 */
		List arrList = new ArrayList();

		arrList.add("cch1");
		arrList.add("cch2");
		arrList.add("cch4");
		arrList.add("cch3");
		arrList.add("cch6");
		arrList.add("cch5");

		for (Object a : arrList) {
			System.out.print(a + " ");
		}
		System.out.println("\n----------------");
//		--------------------------------------------------------------------
		/**
		 * Vector
		 * 优点: 底层数据结构是数组，查询快，增删慢。
		 * 缺点: 线程安全，效率低
		 */
		List vector = new Vector();

		vector.add("cch1");
		vector.add("cch2");
		vector.add("cch4");
		vector.add("cch3");
		vector.add("cch6");
		vector.add("cch5");

		for (Object s : vector) {
			System.out.print(s + " ");
		}
		System.out.println("\n----------------");
//		--------------------------------------------------------------------
		/**
		 * LinkedList
		 * 优点: 底层数据结构是链表，查询慢，增删快。
         * 缺点: 线程不安全，效率高
		 */
		List linkedList = new LinkedList();

		linkedList.add("cch1");
		linkedList.add("cch2");
		linkedList.add("cch4");
		linkedList.add("cch3");
		linkedList.add("cch6");
		linkedList.add("cch5");

		for (Object s : linkedList) {
			System.out.print(s + " ");
		}

	}
}
