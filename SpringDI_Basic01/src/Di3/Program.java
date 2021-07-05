package Di3;

public class Program {

	public static void main(String[] args) {
		
		NewRecordView view = new NewRecordView(); 
		NewRecord record = new NewRecord();
		
		view.setRecord(record); //setter로 주입(다형성을 사용)
		view.input();
		view.print();
	}

}