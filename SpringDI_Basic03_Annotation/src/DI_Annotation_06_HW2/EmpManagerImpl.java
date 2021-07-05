package DI_Annotation_06_HW2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service //@Component 어노테이션을 사용해도 상관없지만 서비스레이어클래스라는 것을 명확하게 함)
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
