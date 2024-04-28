package bean_life;

public class Rabbit {
	static {
		System.out.println("Class Loadng");
	}

	{
		System.out.println("Object Creation");
	}

	public void init() {
		System.out.println("Init method execuited");
	}

	public void destroy() {
		System.out.println("Destroy method execuited");
	}
}
