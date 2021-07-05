package DI2;

public class NewRecordView {
	//점수를 출력하는 클래스
	
	private NewRecord record; //멤버필드의 setter를 통해서 주입

	public void setRecord(NewRecord record) { //record의 setter함수
		this.record = record;
	}

	public void print() {
		System.out.println(record.total() + "/" + record.avg());
	}
}

