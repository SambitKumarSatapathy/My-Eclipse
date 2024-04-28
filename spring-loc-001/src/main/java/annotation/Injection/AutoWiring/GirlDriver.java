package annotation.Injection.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GirlDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springAnnotation.xml");
		Girl g= (Girl) ac.getBean("girl");
		System.out.println(g);
		System.out.println(g.c);
		g.c.eat();
	}

}