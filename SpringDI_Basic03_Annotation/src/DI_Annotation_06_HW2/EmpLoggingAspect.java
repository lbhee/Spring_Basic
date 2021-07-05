package DI_Annotation_06_HW2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component //개발자가 직접 작성한 class를 Bean으로 등록하는 역할 (= @Bean)
public class EmpLoggingAspect {

	//사전충고(타겟메서드 전에 실행) 
	@Before("execution(* DI_Annotation_06_HW.EmpManagerImpl.get*(..))")  //(접근자 패키지.파일명.get으로시작되는 매서드 파라미터0개이상)
	public void before(JoinPoint joinpoint) {
		System.out.println(">>>>> @Before : 타겟-> " + joinpoint.getSignature().getName());
	}
	
	
	//주변충고(타겟메서드 전후로 실행)
	@Around("execution(* DI_Annotation_06_HW.EmpManagerImpl.get*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println(">>>>> @Around[전] : 타겟-> " + pjp.getSignature().getName());
		
		Object obj = pjp.proceed(); //타겟메서드(get으로 시작되는 메서드) --> 메서드실행안해도되고, 여러번해도된다.
		
		System.out.println(">>>>> @Around[후] : 타겟-> " + pjp.getSignature().getName());
		
		return obj;
	}
	
	
	//메서드가 정상적으로 수행된 후에 실행(에러시 실행X)
	@AfterReturning(pointcut="execution(* DI_Annotation_06_HW.EmpManagerImpl.get*(..))", returning="retVal")
	public void afterReturning(JoinPoint joinPoint, Object retVal) throws Throwable {
		System.out.println(">>>>> @AfterReturning : 타겟-> " + joinPoint.getSignature().getName()); //메서드이름
		System.out.println(">>>>> @AfterReturning : 반환값-> " + retVal); //리턴값(참조만 가능)
	}
	
	
	//메서드가 수행된 후 무조건 실행(=finally처럼)
	@After("execution(* DI_Annotation_06_HW.EmpManagerImpl.get*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println(">>>>> @After : 타겟-> " + joinPoint.getSignature().getName());
	}
	
	
	@AfterThrowing(pointcut="execution(* DI_Annotation_06_HW.EmpManagerImpl.get*(..))", throwing="ex")
	public void logAfterThrowingAllMethods(Exception ex) throws Throwable {
		System.out.println(">>>>> @AfterThrowing : " + ex);
	}
	
}
