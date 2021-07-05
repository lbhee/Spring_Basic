package AOP_Basic_Spring05;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class LogPrintBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable { //주업무가 실행되기 전에
		Log log = LogFactory.getLog(this.getClass());
		log.info("[Before Advice Start]");
		log.info("method : " + method.getName());
		log.info("args:" + args.toString());
		log.info("target:" + target.toString());
		
	}
	
}
