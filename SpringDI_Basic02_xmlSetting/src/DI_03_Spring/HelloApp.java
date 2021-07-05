package DI_03_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//영문
		//MessageBean_en messagebean_en = new MessageBean_en();
		//messagebean_en.sayHello("hong");
		
		//한글
		//MessageBean_kr messagebean_kr = new MessageBean_kr();
		//messagebean_kr.sayHello("hong");
		
		//MessageBean messagebean = new MessageBean_kr();
		//messagebean.sayHello("hong");
		
		
		//Spring코드[컨테이너 생성  > 생성된 컨테이너 객체 생성 조립(xml)]
		//컨테이너 생성방법은 다양하다.
		// 1. ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");  --> SpringDI_Basic01에서 사용
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_03_Spring/DI_03.xml");
		//new GenericXmlApplicationContext는 형변환에 이점이 있다.
		//원칙은 (MessageBean)context.getBean("messagebean") 이렇게 형변환하지만, 아래코드처럼 사용가능.
		MessageBean message =  context.getBean("messagebean", MessageBean.class);
		message.sayHello("hong");
	}
}

/*
  요구사항 
 1.한글버전  (hong) : 안녕 hong
 2.영문버전 (hong) : Hello hong
 
MessageBean_kr  >  안녕 hong
MessageBean_en >  Hello hong

>>인터페이스 : MessageBean 설계 (다형성)

*/