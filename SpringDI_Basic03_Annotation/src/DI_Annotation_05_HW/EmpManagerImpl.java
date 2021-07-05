package DI_Annotation_05_HW;

import java.util.ArrayList;
import java.util.List;

public class EmpManagerImpl implements EmpManager { //핵심기능
	
	List<Emp> emps = new ArrayList<Emp>();

	@Override
	public List<Emp> getAllEmps() throws Exception {
		System.out.println("[Target Method] getAllEmps() 호출!");
		//throw new Exception();
		return emps;
	}

	@Override
	public void setEmp(Emp e) {
		emps.add(e);
	}

}
