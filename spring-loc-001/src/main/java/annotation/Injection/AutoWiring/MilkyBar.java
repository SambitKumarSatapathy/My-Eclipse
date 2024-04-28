package annotation.Injection.AutoWiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("milk")
@Primary
public class MilkyBar implements Chocolate{

	@Override
	public void eat() {
		System.out.println("eating MilkyBar");
	}
}
