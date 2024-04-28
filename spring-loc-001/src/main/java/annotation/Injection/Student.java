package annotation.Injection;

/* *Constructor Injection* */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	private int roll;
	private String name;
	private int age;

	
	public Student(@Value("101") int roll, @Value("Jordi")String name, @Value("23")int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}

}
