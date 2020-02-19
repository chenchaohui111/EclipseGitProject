package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	/**
	 * Set
	 * 对于有序无序的理解：
	 *     1）当输入的值大小和底层数组大小差不多的时候，HashSet的输入顺序是无序的，
	 *     但输出是有序的，因为这些数的哈希值，在底层是顺序拍的，故输出也是有序的。
     *     2）而当输入的值大小和底层数组相差很大时，大的数的哈希值有可能是小于比他小的数的，
     *     这时候输出的结果就是无序的。
     *     
     * 使用哪个？
	 *      唯一吗?
	 *			是：Set
	 *				排序吗?
	 *					是：TreeSet或LinkedHashSet
	 *					否：HashSet
	 *  
	 *  TreeSet的主要功能用于排序                              
	 *  LinkedHashSet的主要功能用于保证FIFO即有序的集合(先进先出) 
	 *  HashSet只是通用的存储数据的集合						    
	 * 
	 * 总之: 如果你知道是Set，但是不知道是哪个Set，就用HashSet。
	 */
	public static void main(String[] args) {
		/**
		 * HashSet 
		 * 总结：①去重 ②无序 ③可为null
		 */
		Set<String> hashSet = new HashSet<>();
		String[] strArr = { "11", "11", "12", "13", "1114", "15", "18", "16" };
		for (String x : strArr) {
			hashSet.add(new String(x));
		}

		hashSet.add("14");
		hashSet.remove("11");
		hashSet.add(null);

		for (String x : hashSet) {
			System.out.print(x + " ");
		}
		System.out.println("\n----------------");
//		--------------------------------------------------------------------
		/**
		 * TreeSet 
		 * 总结：①去重 ②有序 ③不可为null
		 */
		Set<Double> treeSet = new TreeSet<>();

		double[] douArr = { 2, 2.0, 4, 411, 3, 5 };
		for (Double x : douArr) {
			treeSet.add(x);
		}

		treeSet.add(5.0);
//		treeSet.add(null);会抛出空指针异常

		for (double x : treeSet) {
			System.out.print(x + " ");
		}

		System.out.println();
		System.out.println(treeSet);
		System.out.println("----------------");
//		--------------------------------------------------------------------
		/**
		 * LinkedHashSet
		 * 总结：①去重 ②FIFO插入有序
		 */

	}

}
