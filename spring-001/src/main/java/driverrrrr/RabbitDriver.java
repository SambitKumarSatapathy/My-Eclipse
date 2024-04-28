package driverrrrr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sambit.Rabbit;

public class RabbitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("second.xml");
		Rabbit r=ac.getBean(Rabbit.class,"r");
		System.out.println(r);
		AbstractApplicationContext aac=(AbstractApplicationContext)ac;
		aac.close();
	}

}
