package java_8_counting;

import java.util.Arrays;
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

	}

}
