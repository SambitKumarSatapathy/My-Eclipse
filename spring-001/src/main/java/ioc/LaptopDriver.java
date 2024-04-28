package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Laptop l= ac.getBean(Laptop.class);
		System.out.println(l);
		System.out.println(l.os);
		System.out.println(l.os.getName());
	}

}
