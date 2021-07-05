package AOP_Basic_Spring07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:AOP_Basic_Spring07/ApplicationContext.xml");
		
		Calc calc =  context.getBean("proxy", Calc.class);
		//int result = calc.ADD(10000, 10000); //보조업무걸림
		int result = calc.SUB(10000, 10000); //보조업무안걸림
		//int result = calc.MUL(10000, 10000);   //보조업무걸림
		System.out.println("AOP결과 : " + result);
			
	}

}
