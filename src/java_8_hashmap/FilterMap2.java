package java_8_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMap2 {
    public static void main(String[] args) {
        Map<Integer, String> HOSTING = new HashMap<>();
		HOSTING.put(1, "mynet.com");
		HOSTING.put(2, "gmail.com");
		HOSTING.put(3, "microsoft.com");
		HOSTING.put(4, "disney.com");
		HOSTING.put(5, "google.com");
		HOSTING.put(6, "yahoo.com");
		HOSTING.put(7, "apple.com");


        //Map -> Stream -> Filter -> Map
		Map<Integer, String> collect = HOSTING.entrySet()
        .stream()
        .filter(map -> map.getKey() == 2)
        .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

    System.out.println(collect);		
    //output : {2= gmail.com }

    Map<Integer, String> collect2 = HOSTING.entrySet()
    .stream()
	.filter(map -> map.getKey() <= 3)
	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(collect2);		
        //output : {1= mynet.com , 2= gmail.com , 3= microsoft.com }


    }

    

    
}
