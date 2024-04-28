package ioc;

public class Dog {
private String breed;
private int age;
public Dog(String breed,int age) {
	super();
	this.breed=breed;
	this.age=age;
    }
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Dog() {
	
}


}
