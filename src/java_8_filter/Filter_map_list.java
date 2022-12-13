package java_8_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_map_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Car> car = Arrays.asList(
				new Car("Porsche", "Panamera"),
				new Car("BMW", "328i"),
				new Car("Jeep", "Wrangler"),
				new Car("Honda", "Accord"),
				new Car("Mercedes", "300"));

		
		
		
		//getting a single string
		
		String output = car.stream()
				.filter(x -> "Honda".equals(x.getName()))  // if input .. "Honda" is in the list 
				.map(Car::getModel)                        // get the model of that input
				.findAny()
				.orElse("");                               //or else print an empty String
		
		
		
		System.out.println("Model : "+output);  // Model : Accord
		
		
		
		
		//getting a list of strings 		
		List<String> list = car.stream()
				.map(Car::getName)				//consists of car names
				.collect(Collectors.toList());
		
		
		System.out.println("List of cars :" + list);	// List of cars :[Porsche, BMW, Jeep, Honda, Mercedes]
		
		
		
		list.forEach(System.out::println);
		
		//output 
		/*
		Porsche
		BMW
		Jeep
		Honda
		Mercedes
		 */
		
		
		
		
		
		
	}
}
