import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmpLifeTest {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sambhu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	//transient state
		Emp e=new Emp();
		e.setName("sam");
		e.setSal(800);
		
//		et.begin();
//		em.persist(e);//persist state
//		et.commit();
		
//		et.begin();
//		em.persist(e);
//		em.detach(e);
//		e.setName("ram");
//		et.commit();
		
//		et.begin();
//		e.setName("ram");
//		em.persist(e);
//		em.detach(e);
//		et.commit();
		
		
		et.begin();
		
		em.persist(e);
		em.detach(e);
		e.setName("hfghham");
		em.merge(e);
		et.commit();
	
	}
}
