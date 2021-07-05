package Spring_DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		//아래코드는 SpringFramework가 제공하는 컨테이너(IOC컨테이너) 안에서 객채생성하기때문에 필요없음.
		/*
		NewRecordView view = new NewRecordView(); 
		NewRecord record = new NewRecord();
		
		view.setRecord(record); //setter로 주입(다형성을 사용)
		*/
		
		//우리가 할 작업은 컨테이너를 만들고 그 메모리에 필요한 객체를 생성하고 조립(주입)하고... 소멸까지.
		
		//1. 저장공간인 컨테이너를 만들고 그 다음 xml파일을 read하기 시작합니다. 컨테이너안에 객체생성, 주입과정을 실행하는 코드
		ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		
		
		
		//2. 다음은 컨테이너 안에서 필요한 객체만 골라서 사용하면 된다. (레고박스안에 만들어진 블럭을 가지고와서 쓰는 것)
		RecordView view = (RecordView)context.getBean("view"); //컨테이너의 수많은 것들중에 id가 뷰인 값을 뽑아서 담는다. context는 타입이 안정해져있어서 자기타입으로 다운캐스팅! 
		
		view.input();
		view.print();
		
		
		
		//예외발생 -> Caused by: java.lang.ClassNotFoundException: org.apache.commons.logging.LogFactory : 드라이버찾아서 넣어주기!
		
	}

}