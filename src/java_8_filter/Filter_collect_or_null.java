package java_8_filter;

import java.util.Arrays;
import java.util.List;

public class Filter_collect_or_null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Car> car = Arrays.asList(
				new Car("Porsche", "Panamera"),
				new Car("BMW", "328i"),
				new Car("Jeep", "Wrangler"),
				new Car("Honda", "Accord"),
				new Car("Mercedes", "300"));
		
		
		
		
		
		Car output = car.stream()                               //convert to Stream			
				.filter(x -> "Mercedes".equals(x.getName()))    //filter for Mercedes only
				.findAny()                                      // If found , return found else return null
				.orElse(null);
		
		System.out.println(output.getName() +" : "+output.getModel()); //Mercedes 300
		
		
		
		
		Car output2 = car.stream()
				.filter((p) -> "Jeep".equals(p.getName()) && "Wrangler".equals(p.getModel()))  //match both name and model
				.findAny()
				.orElse(null);

			System.out.println("car : " + output2.getModel() +"," + output2.getName());  // Wrangler,Jeep
		
		
		
		
		
		Car output3 = car.stream()
				.filter(x -> "Toyota".equals(x.getName()))
				.findAny()                                      //filter for Toyota only
				.orElse(null);                                 // If found , return found else return null
		
		
		System.out.println(output3); //null
		
		

	}

}
