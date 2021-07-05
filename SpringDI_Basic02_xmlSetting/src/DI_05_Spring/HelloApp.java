package DI_05_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		/*
		//java 코드
		 
	    --> new객체 생성해주기 때문에 주소값이 전부 다름
		MyBean mybean= new MyBean();
		MyBean mybean2 = new MyBean("hong");
		MyBean mybean3 = new MyBean();
		 
		System.out.println("mybean : " + mybean);        //mybean : DI_05_Spring.MyBean@7637f22  
		System.out.println("mybean2 : " + mybean2);     //mybean2 : DI_05_Spring.MyBean@4926097b
		System.out.println("mybean3 : " + mybean3);     //mybean3 : DI_05_Spring.MyBean@762efe5d
		
		
		
		--> 싱글톤을 사용했기 때문에 주소값은 하나
		Singleton single = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		System.out.println("single : " + single);       //single : DI_05_Spring.Singleton@41a4555e
		System.out.println("single2 : " + single2);     //single : DI_05_Spring.Singleton@41a4555e
		*/
		
		
		
		//Spring코드
		
		//getBean()  
				//1. return type Object  (타입에 맞는 casting해줘야함)
				//2. 호출시 새로운 객체를 만들지 않는다. (new 하지 않아요)
				//**** 스프링 컨테이너 안에서 객체들의 타입은 디폴트가 singleton이므로 getBean()으로 꺼내온 동일한 객체들은 주소가 같다.**** 
				//예외적으로 getbean() 객체를 생성하게 할 수 있지만 거의 쓰지 않는다.
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_05_Spring/DI_05.xml");
		
		MyBean mybean = context.getBean("mybean", MyBean.class);
		MyBean mybean2 = context.getBean("mybean", MyBean.class);
		MyBean mybean3 = context.getBean("mybean", MyBean.class);				
		System.out.println("주소값 : " + mybean + " : " + mybean2  + " : " + mybean3); //mybean , mybean2 , mybean3 변수가 가지는 주소값은 같다!	
		
		MyBean mybean4 = context.getBean("mybean2", MyBean.class);
		System.out.println("생성자 사용 : " + mybean4); //mybean과 mybean2는 다른 객체이므로 주소값이 다름
		
		
		Singleton single = context.getBean("single",Singleton.class);
		Singleton single2 = context.getBean("single",Singleton.class);		
		System.out.println(single + " / " + single2); //single, single2 변수도 주소값이 같다!
	}

}
