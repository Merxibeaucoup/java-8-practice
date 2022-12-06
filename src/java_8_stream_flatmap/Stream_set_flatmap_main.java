package java_8_stream_flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_set_flatmap_main {

	public static void main(String[] args) {

		
		Student student1 = new Student();
		
		student1.setType("Java Developer");
		student1.addBook("Java 8 in Action");
		student1.addBook("Spring Boot");
		student1.addBook("Hibernate");
		student1.addBook("Spring Framework");
		student1.addBook("Swing");
		student1.addBook("JavaFX");
		student1.addBook("SQL");
		
		
		Student student2 = new Student();
		
		student2.setType("Python Developer");
		student2.addBook("Learning Python");
		student2.addBook("Django");
		student2.addBook("Numpy");
		student2.addBook("SQL");
		
		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		
		
		//output
		//Java Developer [JavaFX, Hibernate, Swing, Spring Framework, Spring Boot, Java 8 in Action, SQL]
		//Python Developer [Django, Learning Python, Numpy, SQL]
		list.forEach(x -> System.out.println(x.getType() + " " + x.getBook()));
		
		System.out.println("--------------------------------");
		
		List<String> collect = list.stream()
				.map(x -> x.getBook()) // Stream<Set<String>>
				.flatMap(x -> x.stream()) // Stream<String>
				.distinct() // unique books occurrence
				.collect(Collectors.toList());
		
		
		//output
		// JavaFX, Hibernate, Swing, Spring Framework, Spring Boot, Java 8 in Action, SQL, Django, Learning Python, Numpy, 
		collect.forEach(x -> System.out.print(x + ", "));
		System.out.println("\n--------------------------------");
		
		list.get(0).getBook().forEach(x -> System.out.println(x));	// get all books for Java_Developer
		
		System.out.println("\n--------------------------------");

		
		list.get(1).getBook().forEach(x -> System.out.println(x));	// get all books for Python_Developer
		
		

	}

}
