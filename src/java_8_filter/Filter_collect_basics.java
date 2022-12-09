package java_8_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_collect_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("mango", "kiwi", "strawberry", "banana", "blueberry", "peach", "apple");
		
		
		List<String> res = list.stream()						// convert list to stream
				.filter(fruit -> !"strawberry".equals(fruit))   // don't like strawberry
				.collect(Collectors.toList()); 					// collect the output and convert stream to a List
		
		res.forEach(System.out::println);
		
		//output
		/*
		mango
		kiwi
		banana
		blueberry
		peach
		apple
		*/
		
				

	}

}
