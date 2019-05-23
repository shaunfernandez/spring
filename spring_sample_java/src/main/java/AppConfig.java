import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.mastercard.repository.CustomerRepository;
import com.mastercard.repository.HibernateCustomerRepositoryImplementation;
import com.mastercard.service.CustomerService;
import com.mastercard.service.CustomerServiceImplementation;

@Configuration
@ComponentScan({"com.mastercard"})
@PropertySource("app.properties")
public class AppConfig {
	
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	//@Bean(name = "customerService")
	//public CustomerService getCustomerService( ) {
		//CustomerServiceImplementation service = new CustomerServiceImplementation(getCustomerRepository());
	//	CustomerServiceImplementation service = new CustomerServiceImplementation();
		//service.setCustomerRepository(getCustomerRepository()); 	//Setter Injection
	//	return service;
	//}
	
	//@Bean(name ="customerRepository")
	//public CustomerRepository getCustomerRepository() {
	//	return new HibernateCustomerRepositoryImplementation();
	//}
}
