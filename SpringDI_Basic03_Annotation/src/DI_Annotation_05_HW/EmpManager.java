package DI_Annotation_05_HW;

import java.util.List;

public interface EmpManager {
	
	public List<Emp> getAllEmps() throws Exception; //사원리스트 메서드
	
	public void setEmp(Emp e); //사원추가 메서드
	
}
