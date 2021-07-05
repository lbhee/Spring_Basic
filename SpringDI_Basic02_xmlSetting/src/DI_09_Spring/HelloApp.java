package DI_09_Spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class HelloApp {

	public static void main(String[] args) {
			
		/*
		ProtocolHandlerFactory factory = new ProtocolHandlerFactory();

		Map<String , ProtocolHandler> handler = new HashMap<String, ProtocolHandler>();
		handler.put("rest", new RestHandler());
	    handler.put("rss", new RssHandler());
	    
	    factory.setHandlers(handler);
	    */
		
	    ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_09_Spring/DI_09.xml");
	}

}


