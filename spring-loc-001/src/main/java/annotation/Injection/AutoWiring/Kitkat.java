package annotation.Injection.AutoWiring;

import org.springframework.stereotype.Component;

@Component("kit")
public class Kitkat implements Chocolate {

	@Override
	public void eat() {
		System.out.println("eating Kitkat");
	}

}
