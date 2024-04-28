package ioc;

public class Dog {
	
	String breed;
	int price;
	
	public String getBreed() {
		return breed;
	}
	public void setBreen(String name) {
		this.breed = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Dog(String breed, int price) {
		super();
		this.breed = breed;
		this.price = price;
	}
}
