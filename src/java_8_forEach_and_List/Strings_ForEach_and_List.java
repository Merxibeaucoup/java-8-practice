package java_8_forEach_and_List;

import java.util.ArrayList;
import java.util.List;

public class Strings_ForEach_and_List {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<>();
		items.add("Henry");
		items.add("Jacobs");
		items.add("Elliot");
		items.add("Edwards");
		items.add("Saquan");
		items.add("Etienne");
		items.add("McCaffery");
		items.add("Foreman");
		
		//output : Henry Jacobs Elliot Edwards Saquan Etienne McCaffery 
		for(String item : items){
			System.out.print(item+" "); 
		}
		System.out.println("\n-----------------------\n");
		
		//output : Henry Jacobs Elliot Edwards Saquan Etienne McCaffery 
		 items.forEach(item -> System.out.print(item + " "));		 
		 System.out.println("\n-----------------------\n");
		 
		 
		//output : HenryJacobsElliotEdwardsSaquanEtienneMcCaffery 
		 items.forEach(System.out::print);
		 
		// output : Edwards
			items.forEach(item->{
				if("Edwards".equals(item)){
					System.out.println(item); 	
				}
			});
			
			System.out.println("\n-----------------------\n");
			
			List<String> alphaUpper = new ArrayList<>();
			for (String s : items) {
			    alphaUpper.add(s.toUpperCase());
			}
			
			System.out.println(items); 	// output : [Henry, Jacobs, Elliot, Edwards, Saquan, Etienne, McCaffery]
			System.out.println(alphaUpper); // output : [HENRY, JACOBS, ELLIOT, EDWARDS, SAQUAN, ETIENNE, MCCAFFERY]

	}

}
