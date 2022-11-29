package java_8_forEach_and_List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_Practice {

	public static void main(String[] args) {

		int[] number = { 12, 21, 34, 46, 52, 61, 72, 86, 93, 10 };
		List<Integer> list1 = Arrays.stream(number).boxed().collect(Collectors.toList());
		
		System.out.println("list : " + list1);  
		
		
		System.out.println("\n----------------------------------\n");
		
		String[] alphabet = new String[]{"Peyton", "Eli", "Brady", "Rodgers", "Brees"};

		List<String> list = Arrays.asList(alphabet);
		
		if (list.contains("Eli") || list.contains("Brady")) {
		    System.out.println("1. Hello Eli or Brady");	// output : 1. Hello Eli or Brady
		}


		if (list.containsAll(Arrays.asList("Eli", "Brady"))) {
		    System.out.println("2. Hello Eli or Brady");	// output : 3. Hello Eli and Brady
		}

	}

}
