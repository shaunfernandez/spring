import com.mastercard.service.CustomerService;
import com.mastercard.service.CustomerServiceImplementation;

public class Application {

	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImplementation();
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
