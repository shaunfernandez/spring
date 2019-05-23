import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mastercard.service.CustomerService;
import com.mastercard.service.CustomerServiceImplementation;

public class Application {

	public static void main(String[] args) {

		//CustomerService service = new CustomerServiceImplementation();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
