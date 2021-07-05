package AOP_Basic_Spring07;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println("Around Advice Invoke Start");
		System.out.println("method : " + method);
		
		//보조업무
		Log log = LogFactory.getLog(this.getClass()); //현재동작하는 객체의 정보
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");	
		
		//주업무(실객체의 함수 호출)
		Object result =  method.proceed(); //실객체의 실함수를 호출한 결과를 받는다..(어떤타입일지모르니 오브젝트로)
		
		//보조업무
		sw.stop();
		log.info("[타이머 종료]");
		log.info("[Time log Method : " + method + "]");
		log.info("[Time log MEthod : " + sw.getTotalTimeMillis() + "]");
		
		return result;
	}



}
