package java_8_sorting;

import java.math.BigDecimal;

public class Soccer {
	
	String name;
	BigDecimal price;	
	int age;
	
	public Soccer() {
		
	}

	public Soccer(String name, BigDecimal price, int age) {
		super();
		this.name = name;
		this.price = price;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Soccer [name=" + name + ", price=" + price + ", age=" + age + "]";
	}
	
	

}
