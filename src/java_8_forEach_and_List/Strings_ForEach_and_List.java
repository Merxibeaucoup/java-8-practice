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
		
		//output : Henry Jacobs Elliot Edwards Saquan Etienne McCaffery 
		for(String item : items){
			System.out.print(item+" "); 
		}
		System.out.println("\n-----------------------\n");


	}

}
