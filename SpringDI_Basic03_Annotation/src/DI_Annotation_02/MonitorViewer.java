package DI_Annotation_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
	
	private Recoder recoder;

	public Recoder getRecoder() {
		return recoder;
	}
	
	//같은 객체를 구분하기 위해 별칭을 붙여준다!
	@Autowired	
	@Qualifier("recorder_1")  //<qualifier value="recorder_1"></qualifier>
	public void setRecoder(Recoder recoder) {
		this.recoder = recoder;
	}
	
	
	@Autowired	
	@Qualifier("recorder_2")
	public void Gmethod(Recoder rec) {
		System.out.println("Gmethod(rec) : " + rec);
	}
	
	
}
