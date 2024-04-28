

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sambhu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bus b= new Bus();
		b.setBid(101);
		b.setNumber("sa 6549");
		
		
		Passenger p1= new Passenger();
		p1.setPid(201);
		p1.setName("sambit");
		p1.setGender("male");
		p1.setB(b);
		
		
		Passenger p2= new Passenger();
		p2.setPid(202);
		p2.setName("modi");
		p2.setGender("male");
		p2.setB(b);
		
		Passenger p3= new Passenger();
		p3.setPid(203);
		p3.setName("yogi");
		p3.setGender("male");
		p3.setB(b);
		
		List<Passenger> p=new ArrayList<Passenger>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		b.setP(p);
		
		et.begin();
		em.persist(b);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		et.commit();
	}

}
