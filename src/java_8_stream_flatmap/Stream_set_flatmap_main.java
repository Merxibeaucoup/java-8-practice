package java_8_stream_flatmap;

import java.util.ArrayList;
import java.util.List;

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

	}

}
