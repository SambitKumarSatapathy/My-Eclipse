package sambhu;

import javax.swing.AbstractCellEditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class pilot {
	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("springxml.xml");
		Aeroplane a1=(Aeroplane)ac.getBean("ae");
		System.out.println(a1);
		
		Aeroplane a2=(Aeroplane)ac.getBean("ae");
		System.out.println(a2);
	}

}
