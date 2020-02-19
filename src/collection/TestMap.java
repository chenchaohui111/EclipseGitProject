package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	/**
	 * Map
	 * 总结：①Hashtable由于同步导致的性能开销，现很少使用
	 * 		②HashMap 它的put和get方法，可以达到常数时间的性能 用得较多
	 * 
	 * 关于遍历Map: Map集合不能直接使用迭代器或者foreach进行遍历。但是转成Set之后就可以使用了
	 */
	public static void main(String[] args) {
		/**
		 * HashMap
		 * 特点：①无序 ②非线程安全 ③效率较高 ④允许null（key和value都允许）⑤父类是AbstractMap
		 * 		⑥方法不是同步的 ⑦底层是哈希表
		 */
		System.out.println("--------HashMap----------");
		Map<String, String> hashMap = new HashMap<>();

		// 给map中添加元素
		hashMap.put("星期一", "Monday");
		hashMap.put("星期二", "Tuesday");
		hashMap.put("星期三", "Wednesday");
		hashMap.put("星期四", "Thursday");
		hashMap.put("星期日", "Sunday");
		System.out.println(hashMap); // {星期日=Sunday, 星期一=Monday}

		// 当给Map中添加元素，会返回key对应的原来的value值，若key没有对应的值，返回null
		System.out.println(hashMap.put("星期一", "Mon")); // Monday
		System.out.println(hashMap); // {星期日=Sunday, 星期一=Mon}

		// 根据指定的key获取对应的value
		String en = hashMap.get("星期日");
		System.out.println(en); // Sunday
		
		// 根据key删除元素,会返回key对应的value值
		String value = hashMap.remove("星期日");
		System.out.println(value); // Sunday
		System.out.println(hashMap); // {星期一=Mon}
		
		//Map添加null值
		hashMap.put(null, null);
		System.out.println(hashMap);
		System.out.println();
		
		//Map集合遍历: 键找值方式
		Set<String> keySet = hashMap.keySet();//获取键集合
		
		for(String key : keySet ) {
			System.out.print(key +": "+hashMap.get(key) + "  ");
		}
		System.out.println();
		
		//Map集合遍历: 键值对方式
		Set<Entry<String, String>> entrySet = hashMap.entrySet();//获取键值对集合
		
		for(Entry entry: entrySet) {
			System.out.print(entry.getKey()+": "+ entry.getValue()+"  ");
		}
		System.out.println();
		
//		------------------------------------------------------------------------
		
		/**
		 * TreeMap
		 * 特点：①有序（默认升序） ②底层是二叉树 ③线程不同步 ④父类是AbstractMap
		 * 
		 */
		System.out.println("\n---------TreeMap---------");
		Map<String, String> treeMap = new HashMap<>();

		// 给map中添加元素
		treeMap.put("星期一", "Monday");
		treeMap.put("星期日", "Sunday");
		System.out.println(treeMap); // {星期日=Sunday, 星期一=Monday}

		// 当给Map中添加元素，会返回key对应的原来的value值，若key没有对应的值，返回null
		System.out.println(treeMap.put("星期一", "Mon")); // Monday
		System.out.println(treeMap); // {星期日=Sunday, 星期一=Mon}

		// 根据指定的key获取对应的value
		String en2 = treeMap.get("星期日");
		System.out.println(en2); // Sunday

		// 根据key删除元素,会返回key对应的value值
		String value2 = treeMap.remove("星期日");
		System.out.println(value2); // Sunday
		System.out.println(treeMap); // {星期一=Mon}
		
		//Map添加null值
		treeMap.put(null, null);
		System.out.println(treeMap);
		
//		------------------------------------------------------------------------
		
		/**
		 * HashTable
		 * 特点：①无序 ②线程安全 ③效率较低 ④不允许null ⑤父类是Dictionary 
		 *      ⑥方法是同步的 ⑦底层是哈希表
		 */
		System.out.println("\n--------HashTable--------");
		Map<String, String> hashTable = new Hashtable<>();

		// 给map中添加元素
		hashTable.put("星期一", "Monday");
		hashTable.put("星期日", "Sunday");
		System.out.println(hashTable); // {星期日=Sunday, 星期一=Monday}

		// 当给Map中添加元素，会返回key对应的原来的value值，若key没有对应的值，返回null
		System.out.println(hashTable.put("星期一", "Mon")); // Monday
		System.out.println(hashTable); // {星期日=Sunday, 星期一=Mon}

		// 根据指定的key获取对应的value
		String en1 = hashTable.get("星期日");
		System.out.println(en1); // Sunday

		// 根据key删除元素,会返回key对应的value值
		String value1 = hashTable.remove("星期日");
		System.out.println(value1); // Sunday
		System.out.println(hashTable); // {星期一=Mon}
		
		//添加null值 非法 抛出空指针异常
//		hashTable.put(null, null);
//		System.out.println(hashTable);

	}

}
