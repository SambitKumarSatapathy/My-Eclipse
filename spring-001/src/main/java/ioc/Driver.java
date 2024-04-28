package ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Driver {
	public static void main(String[] args) {
//		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
//		Cat c=(Cat)ac.getBean("dead", Cat.class);
//		System.out.println(c);
//		Cat c1=(Cat)ac.getBean("dead", Cat.class);
//		System.out.println(c1);
//		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("spring.xml"));
//		Dog d=(Dog)bf.getBean(Dog.class);
//		System.out.println(d);
//		BeanFactory  bf=new ClassPathXmlApplicationContext("spring.xml");
//		Cat cat=(Cat)bf.getBean(Cat.class);
////		System.out.println(cat.getAge());
//		System.out.println(cat.getCol());
//		System.out.println(cat.getName());
//		
	//	System.out.println(cat);
		ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");	
		Cat cat=(Cat) ac.getBean("c");
		System.out.println(cat);
		System.out.println(cat.getCol());
		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		
		
	}
}
