package dependency_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc.Cat;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
		
		Car c= ac.getBean(Car.class);
		System.out.println(c);
		System.out.println(c.getEngine());
	}
}
