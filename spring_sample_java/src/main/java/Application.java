import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
import com.mastercard.service.CustomerService;
import com.mastercard.service.CustomerServiceImplementation;

public class Application {

	public static void main(String[] args) {

			
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//CustomerService service = new CustomerServiceImplementation();
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service);
		
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
