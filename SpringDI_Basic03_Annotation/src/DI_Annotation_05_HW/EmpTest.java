package DI_Annotation_05_HW;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpTest {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_Annotation_05_HW/Aspect_Annotation.xml");
		
		EmpManager manager = context.getBean("empManagerImpl", EmpManager.class);
		
		manager.setEmp(new Emp("1", "홍길동"));
		manager.setEmp(new Emp("2", "김유신"));
		
		List<Emp> emps = manager.getAllEmps();
		System.out.println("main : " + emps);
	}
}

/*
 	Aspect : 횡단관심사를 모듈화
 	
	@Aspect을 사용하여 Aspect를 생성한다.
	@Pointcut으로 포인트컷을 정의하거나, @Before, @After에 표현식을 사용하여 포인트컷을 지정할 수 있다. (https://devjms.tistory.com/70)
	
	* jar파일추가(3.0.2)
	 - com.springsource.org.aspectj.weaver (tools써도 되는데 차이를 모르겠음)
	 - com.sptringsource.org.aoplliance
	
	<.xml파일로 설정시>
	 - xmlns:aop="http://www.springframework.org/schema/aop"
	 - xsi:schemaLocation= "http://www.springframework.org/schema/aop 
		   	                http://www.springframework.org/schema/aop/spring-aop.xsd"
	 - <aop:aspectj-autoproxy />
	
	<자바파일로 설정시>
	 - @EnableAspectJAutoProxy
 */