package DI;

public class NewRecordView {
	//점수를 출력하는 클래스
	private NewRecord record; //뉴레코드뷰클래스가 뉴레코드를 의존(필요)한다. (복합연관)
	
	public NewRecordView(int kor, int eng, int math) { //뉴레코드뷰클래스가 필요한 객체를 생성자를 통해서 생성한다. (두객체의 라이프사이클은 같다.)
		record = new NewRecord(kor, eng, math);
	}
	
	public void print() {
		System.out.println(record.total() + "/" + record.avg());
	}
}
