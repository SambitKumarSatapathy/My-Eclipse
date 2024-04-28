package annotation.Injection;

/* *Field Injection* */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	@Value("101")
	int eid;
	@Value("Jordi")
	String name;
	@Value("150.00")
	double sal;
}
