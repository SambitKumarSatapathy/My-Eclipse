package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pilot {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springAnnotation.xml");
		Aeroplace a = (Aeroplace)ac.getBean("aero");
		System.out.println(a);
		
		Aeroplace a1 = (Aeroplace)ac.getBean("aero");
		System.out.println(a1);
	}
}
