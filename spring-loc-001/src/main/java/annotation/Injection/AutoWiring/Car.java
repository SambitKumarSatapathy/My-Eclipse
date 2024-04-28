package annotation.Injection.AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	@Autowired /* field Injection */
	private Engine e;

	public Car(@Autowired Engine e) /* Constructor Injection */
	{
		this.e = e;
	}
	
}
