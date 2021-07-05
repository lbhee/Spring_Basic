package DI_Annotation_06_HW2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import DI_Annotation_04.ConfigContext;

public class EmpTest {
	public static void main(String[] args) throws Exception {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
		
		EmpManager manager = context.getBean(EmpManager.class);
		
		
		manager.setEmp(new Emp("1", "홍길동"));
		manager.setEmp(new Emp("2", "김유신"));
		
		List<Emp> emps = manager.getAllEmps();
		System.out.println("main : " + emps);
	}
}
