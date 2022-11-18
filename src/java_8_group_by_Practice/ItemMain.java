package java_8_group_by_Practice;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemMain {

	
	public static void main(String[] args) {
		
		/**
		 *  grocery cart for example 
		 * name , quantity , price 
		 * count number of key occurrence  
		 * 
		 */
		
		List<Item> items = Arrays.asList(  	
				new Item("banana", 20, new BigDecimal("19.99")),
				new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")),
				new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99"))             
			);
		
		
			
		/**
		 *  
		 * HashMap to get the Key, Value pairs
		 * retrieve the stream from the list and use a Collector to group them , then count its occurrence 
		 * 
		 * Basically what the code below does is ,get item name as the key 
		 * then counts the number of its occurrence 
		 * 
		 * counting() returns the number of occurrence for each key
		 */
		
		System.out.println("--------------------------");
		Map<String, Long> counting = items.stream()
										.collect(
										Collectors.groupingBy(Item::getName, Collectors.counting()));
		
		

		System.out.println("--------------------------");
		System.out.println(counting);
		
		
		
		/**
		 *  retrieve the stream from the list and use a Collector to group them , then sum the quantity 
		 *  
		 *  summingInt() returns the sum for each key
		 */
		
		
		System.out.println("--------------------------");
		Map<String, Integer> sum = items.stream()
										.collect(
										Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQuantity)));

		System.out.println("--------------------------");
		System.out.println(sum);



	}

}
