package java_8_stream_flatmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList {

    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();
		map.put(1, "Python");
		map.put(2, "Java8");
		map.put(3, "C#");
		map.put(4, "C++");
		map.put(5, "Dijango");
		map.put(6, "Spring");
		map.put(7, "Hibernate");
		map.put(8, "Jpa");
		map.put(9, ".Net Core");

        System.out.println("Listed Map Keys -----------------------------------------");
		List<Integer> result = new ArrayList<>(map.keySet());
		result.forEach(System.out::println);
// same as 
        List<Integer> result3 = map.keySet().stream()
			.collect(Collectors.toList());
		result3.forEach(System.out::println);


        System.out.println("Listed Map Values -----------------------------------------");

		List<String> result2 = new ArrayList<>(map.values());
		result2.forEach(System.out::println);
// same as
        List<String> result4 = map.values().stream()
        .collect(Collectors.toList());
        result4.forEach(System.out::println);

        System.out.println("Listed Map with filter-----------------------------------------");

		List<String> result5 = map.entrySet().stream()
				.filter(x->!"Spring".equals(x.getValue())) // excludes spring
				.map(x->x.getValue())
				.collect(Collectors.toList());
		result5.forEach(System.out::println);

    }
    
}
