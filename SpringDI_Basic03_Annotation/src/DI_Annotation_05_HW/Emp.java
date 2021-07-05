package DI_Annotation_05_HW;

public class Emp {

	private String empno;
	private String ename;
	
	public Emp(String empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}
	
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
}
