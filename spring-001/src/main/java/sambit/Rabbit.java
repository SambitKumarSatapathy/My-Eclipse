package sambit;

public class Rabbit {
  static {
	  System.out.println("class loading");
  }
  {
	  System.out.println("obj is created");
  }
  public void init() {
	// TODO Auto-generated method stub
	  System.out.println("init method");
}
  public void destroy() {
	// TODO Auto-generated method stub
	  System.out.println("destroy method");

}
}
