package DI_Annotation_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {
	
	public static void main(String[] args) {
		
		/*
		MonitorViewer viewer = new MonitorViewer();
		Recoder recoder = new Recoder();
		
		viewer.setRecoder(recoder); //주입(injection)
		
		System.out.println(viewer.getRecoder());
		*/
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_Annotation_02/DI_Annotation_02.xml");
		
		MonitorViewer viewer = context.getBean("monitorViewer", MonitorViewer.class);
		
		System.out.println(viewer.getRecoder());
		
	}

}
