package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import Spring.Client;

//xml > java 파일 > prototype 설정

@Configuration
public class JavaConfigPrototype {
	
/*	
  <bean id="client" class="Spring.Client" scope="prototype">
	<property name="host" value="webserver"></property>
  </bean>
*/
	@Bean  
	@Scope("prototype")   //--> getbean()할때마다 객체를 새롭게 만든다!
	public Client client(){
		Client client = new Client();
		client.setHost("webserver");
		return client;
	}

}


