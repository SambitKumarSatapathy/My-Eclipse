package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoimpli;
import com.spring.jdbc.entity.Student;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("program started");
    	ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	StudentDao studentDao=ac.getBean("studentDao",StudentDao.class);
    	Student s= new Student();
//    	s.setId(333);
//    	s.setName("john");
//    	s.setCity("bng");
//    	int res= studentDao.insert(s);
//    	System.out.println("insert done");
//    	s.setId(333);
//    	s.setName("sambhu");
//     	s.setCity("usa");
//     	int res= studentDao.change(s);
//     	System.out.println("update done");
    	
//     	int res= studentDao.delete(333);
//     	System.out.println("delete done");
    	
    	Student student=studentDao.getStudent(111);
    	System.out.println(student);
    }
}
