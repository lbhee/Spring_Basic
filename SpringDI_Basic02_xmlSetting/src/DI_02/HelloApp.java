package DI_02;

public class HelloApp {

	public static void main(String[] args) {
		//영문
		//MessageBean_en messagebean_en = new MessageBean_en();
		//messagebean_en.sayHello("hong");
		
		//한글
		//MessageBean_kr messagebean_kr = new MessageBean_kr();
		//messagebean_kr.sayHello("hong");
		
		
		//위코드처럼 각각 객체생성을 해주는것보다 다형성을 쓰는것이 좋다.
		MessageBean messagebean = new MessageBean_kr();
		messagebean.sayHello("hong");
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