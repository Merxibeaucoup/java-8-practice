package java_8_sorting;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SortLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Soccer> list = new ArrayList<>();

		// add to List
		// name , price, age
		// new soccer object

		list.add(new Soccer("Neymar", new BigDecimal("22000"), 26));
		list.add(new Soccer("Messi", new BigDecimal("48000"), 33));
		list.add(new Soccer("Ronaldo", new BigDecimal("47500"), 34));
		list.add(new Soccer("Ayew", new BigDecimal("12000"), 30));
		list.add(new Soccer("Inaki", new BigDecimal("18000"), 24));
		list.add(new Soccer("Partey", new BigDecimal("20000"), 27));
		list.add(new Soccer("Antony", new BigDecimal("50000"), 23));
		list.add(new Soccer("Salah", new BigDecimal("45000"), 25));
		list.add(new Soccer("Benzema", new BigDecimal("49000"), 29));
		list.add(new Soccer("Sterling", new BigDecimal("39000"), 28));
		list.add(new Soccer("Modric", new BigDecimal("38700"), 32));
		
		
		
		//simple loop for soccer class 
		int i =1;
		for (Soccer player : list) {
			System.out.println("@ "+i+" : "+player.getName()+" "+player.getAge()+" "+player.getPrice()+" ");
			i++;
		}



		

	}

}
