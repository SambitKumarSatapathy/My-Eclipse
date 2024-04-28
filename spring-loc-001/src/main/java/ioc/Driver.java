package ioc;

/*import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Cat c = (Cat) ac.getBean("dead", Cat.class);
		System.out.println(c.getName());
		System.out.println(c.getPrice());
		
		Dog d= ac.getBean(Dog.class);
		System.out.println(d.getBreed());
		System.out.println(d.getPrice());

		/*
		 * Cat c1 = (Cat) ac.getBean("dead", Cat.class); 
		 * System.out.println(c1);
		 * 
		 * BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring.xml")); 
		 * Dog d= (Dog)bf.getBean(Dog.class); System.out.println(d);
		 */
	}
}
