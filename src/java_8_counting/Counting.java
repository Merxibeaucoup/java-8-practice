package java_8_counting;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counting {

	public static void main(String[] args) {
		
			
		
		/**
		 * count the number of times each item appears
		 */
		
		
		List<String> items = Arrays.asList(
				"apple", "apple", "melon", "apple", "apple", "melon", "banana", "apple",
				"melon", "orange", "orange", "banana", "melon", "papaya", "melon", "lemon");
		
		Map<String, Long> count = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(count);
		
		
		
		
		
		System.out.println("-------------------------------------");
		Map<String, Long> finalMap = new LinkedHashMap<>();

		//sort the count map and put into finalMap 
		count.entrySet().stream()
			.sorted(Map.Entry.<String, Long>comparingByValue()
				.reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

		System.out.println(finalMap);

	}
	
	

}
