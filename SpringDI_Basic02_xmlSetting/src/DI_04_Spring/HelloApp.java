package DI_04_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//java 코드
		//MessageBeanImpl messagebean = new MessageBeanImpl("hong");
		//messagebean.setGreeting("hello");
		//messagebean.sayHello();

		//Spring
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_04_Spring/DI_04.xml");
		
		MessageBean messagebean=  context.getBean("m1" , MessageBean.class); //"m2" "m3" "m4" 써도 같은 결과
		messagebean.sayHello();
	}

}
