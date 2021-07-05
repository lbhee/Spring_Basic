package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	
	private Recoder recoder;

	public Recoder getRecoder() {
		return recoder;
	}
	
	//setter를 통해서 Recorder객체의 주소를 자동으로 주입받겠다.(By Type이 컨테이너 안에 있으면..)
	/*
	 	<property name="recoder">
			<ref bean="recoder"/>
		</property>
		
		이것과 같은 코드 = @Autowired
	 */
	
	//@Autowired(required = true)   디폴트값! (무조건 injection하겠다.)
	//@Autowired(required = false)  같은타입이 없으면 안하면 되지
	@Autowired(required = true)
	public void setRecoder(Recoder recoder) {
		this.recoder = recoder;
	}
}
