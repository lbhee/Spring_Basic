package Di3;

import java.util.Scanner;

public class NewRecordView implements RecordView{
	//점수를 출력하는 클래스
	
	private NewRecord record; //상황에 따라 private Record record이렇게도 가능함(인터페이스타입)

	public void setRecord(Record record) { //파라메터로 다형성으로 유연하게 들어올 수 있다. 인터페이스 타입 
		this.record = (NewRecord)record; //다운케스팅
	}
	
	@Override
	public void print() {
		System.out.println(record.total() + "/" + record.avg());
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("kor: ");  //만일, private NewRecord record를 private Record record로 썼으면 여기에러. (인터페이스가 가진 자원만 사용가능하니까)
		record.setKor(sc.nextInt());
		
		System.out.println("eng: ");
		record.setEng(sc.nextInt());
	
		System.out.println("math: ");
		record.setMath(sc.nextInt());
	}
}

