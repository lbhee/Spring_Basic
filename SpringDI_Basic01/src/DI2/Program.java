package DI2;

public class Program {

	public static void main(String[] args) {
		
		NewRecordView view = new NewRecordView(); //따로(집합연관)
		
		//NewRecord 객체가 필요할 때가 생기면 그때
		NewRecord record = new NewRecord(100, 50, 50); //따로(집합연관)
		view.setRecord(record); //주입 (setter를 통해서) --> 의존성

		view.print();

	}

}
//나는 니가필요해...(포함)
//1. [생성자]를 통해서 필요한 객체를 생성 or 주입 --> DI패키지에서 (복합연관) 의무적일때. 
//2. 함수(setter)를 통해서 필요한 객체를 주입   --> DI2패키지에서(집합연관) 뉴레코드뷰를 만들었다고해서 뉴레코드를 꼭써야하는것은 아님. 필요하면 그때.