import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testproperties {

	public static void main(String[] args) throws IOException {
		FileInputStream f= new FileInputStream("persion.properties");
		Properties p =new Properties();
		p.load(f);
		String name= p.getProperty("name");
		String gender= p.getProperty("gender");
		int age=Integer.parseInt(p.getProperty("age"));
		System.out.println("name :"+name);
		System.out.println("gender :"+gender);
		System.out.println("age :"+age);
	}

}
