package java_8_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConvertMapToList {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Python");
		map.put(2, "Java8");
		map.put(3, "C#");
		map.put(4, "C++");
		map.put(5, "Dijango");
		map.put(6, "Spring");
		map.put(7, "Hibernate");
		map.put(8, "Jpa");
		map.put(9, ".Net Core");
		
		
		/*
		 * get KeySet()
		 * 
		 * example 1 : uses an Arraylist 
		 * example 2 : uses a stream 
		 */
		System.out.println(" ex1 Listed Map Keys -----------------------------------------");
		
		List<Integer> resultk1 = new ArrayList(map.keySet());   // list to get the keyset()
		resultk1.forEach(System.out::println);
		
		// code Below yields same output
		
		List<Integer> resultk2 = map.keySet()
				.stream()                                // stream just the keys 
				.collect(Collectors.toList());          // make them into a list
		
		
		resultk2.forEach(System.out::println);
		
		

		/*
		 * get values()
		 * 
		 * example 1 : uses an Arraylist 
		 * example 2 : uses a stream 
		 */
		
		System.out.println(" ex2 Listed Map Values -----------------------------------------");
		
		List<String> resultv1 = new ArrayList(map.values()); 
		resultv1.forEach(System.out::println);
		
		// code Below yields same output
		
		List<String> resultv2 = map.values()
				.stream()                                     
				.collect(Collectors.toList());
		
		resultv2.forEach(System.out::println);
		
		
		
		/*
		 *  stream and filter entrySet()
		 *  collect all items except Spring
		 *  
		 */
		System.out.println(" ex3 Listed Map with filter-----------------------------------------");
		
		List<String> result5 = map.entrySet()
				.stream()
				.filter(x->!"Spring".equals(x.getValue()))
				.map(x->x.getValue())
				.collect(Collectors.toList());
		
		result5.forEach(System.out::println);
		
		
		
		/*
		 * multiple filter values 
		 * created own method
		 * excludes the values in the list 
		 */
		System.out.println(" ex4 Listed Map with multiple filter-----------------------------------------");
		
		Map<Integer, String> fakemap=filterByValue(map, x -> (x.contains("Python") || x.contains("Hibernate")));

		List<String> result6 = fakemap.entrySet().stream()
				.map(x->x.getValue())
				.collect(Collectors.toList());
		
		result6.forEach(System.out::println);

	}
	// Generic Map filterbyvalue, with predicate
	public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
		return map.entrySet()
			.stream()
			.filter(x -> !predicate.test(x.getValue()))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}

}
