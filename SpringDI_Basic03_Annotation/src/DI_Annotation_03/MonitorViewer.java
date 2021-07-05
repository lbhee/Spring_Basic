package DI_Annotation_03;

import javax.annotation.Resource;

public class MonitorViewer {
	
	private Recoder recoder;

	public Recoder getRecoder() {
		return recoder;
	}
	
	
	/*
	  @Autowired는 같은 타입(by type)
	  @Resource는  같은 이름(by name)
	 */
	@Resource(name="zz") //같은 타입의 객체가 여러개있더라도 name 값으로 찾는다.
	public void setRecoder(Recoder recoder) {
		this.recoder = recoder;
	}

	
}
