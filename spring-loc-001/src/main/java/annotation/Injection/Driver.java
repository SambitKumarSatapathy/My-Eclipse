package annotation.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springAnnotation.xml");
		Employee e = (Employee) ac.getBean("emp");
		System.out.println(e.eid + " " + e.name + " " + e.sal);
		
		Person p = (Person) ac.getBean("per");
		System.out.println(p.getPid() + " " + p.getName() + " " + p.getGender());
		
		Student s = (Student) ac.getBean("std");
		System.out.println(s);
	}
}
