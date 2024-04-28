package annotation.Injection.AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("girl")
public class Girl {
	@Autowired
	@Qualifier("kit")
	Chocolate c;

}
