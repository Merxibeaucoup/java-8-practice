package java_8_stream_flatmap;

import java.util.HashSet;
import java.util.Set;

public class Student {
	
	private String type;
	private Set<String> book = new HashSet<String>();
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<String> getBook() {
		return book;
	}

	public void setBook(Set<String> book) {
		this.book = book;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
