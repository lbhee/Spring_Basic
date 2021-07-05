package DI_Annotation_05_HW;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmpLoggingAspect {
	
	//포인트컷 메소드 지정 -> ("일치하는 이름(모든접근자 DI_Annotation_05_HW패키지.EmpManagerImpl파일.get으로시작되는 메서드(파라미터0개이상))")
	@Pointcut("execution(* DI_Annotation_05_HW.EmpManagerImpl.get*(..))")
 	private void myPointcut() {}

	
	//타겟메서드 전에 실행 
    //@Before("execution(* DI_Annotation_05_HW.EmpManagerImpl.get*(..))") 이렇게 써도된다.
	@Before("myPointcut()")
	public void before(JoinPoint joinpoint) {
		System.out.println(">>>>> @Before : 타겟-> " + joinpoint.getSignature().getName());
	}
	
	
	//타겟메서드 전/후로 실행
	@Around("myPointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println(">>>>> @Around[전] : 타겟-> " + pjp.getSignature().getName());
		
		Object obj = pjp.proceed(); //타겟메서드(get으로 시작되는 메서드) --> 메서드실행안해도되고, 여러번해도된다.
		
		System.out.println(">>>>> @Around[후] : 타겟-> " + pjp.getSignature().getName());
		
		return obj; //리턴값을 변경 가능함!
	}
	
	
	//타켓메서드가 수행된 후 무조건 실행(=finally처럼)
	@After("myPointcut()")
	public void after(JoinPoint joinPoint) {
		System.out.println(">>>>> @After : 타겟-> " + joinPoint.getSignature().getName());
	}
		
		
	//타겟메서드가 정상적으로 수행된 후에 실행(에러시 실행X)
	@AfterReturning(pointcut="myPointcut()", returning="retVal")
	public void afterReturning(JoinPoint joinPoint, Object retVal) throws Throwable {
		System.out.println(">>>>> @AfterReturning : 타겟-> " + joinPoint.getSignature().getName()); //메서드이름
		System.out.println(">>>>> @AfterReturning : 반환값-> " + retVal); //리턴값(참조만 가능, 변경불가능)
	}
	
	
	//타켓메서드 에러(예외)발생시 실행
	@AfterThrowing(pointcut="myPointcut()", throwing="ex")
	public void logAfterThrowingAllMethods(Exception ex) throws Throwable {
		System.out.println(">>>>> @AfterThrowing : " + ex);
	}
	
}
