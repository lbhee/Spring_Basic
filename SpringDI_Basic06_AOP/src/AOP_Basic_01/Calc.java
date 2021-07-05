package AOP_Basic_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Calc {
/*
	간단한 사칙 계산기 프로그램
	- 주관심 (업무) : 사칙연산(ADD, MUL) -> 기능(함수)구현
	- 보조관심(공통관심) : 연산에 걸린시간
	-log로 출력(console에 출력 , red글자로)
	
	
	아래와 같은 함수가 많아질수록.. 유지보수가 힘들다.
*/
	
	public int Add(int x, int y) {
		
		//보조업무
		Log log = LogFactory.getLog(this.getClass()); //현재동작하는 객체의 정보
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");		
		
		//주업무
		int result = x+y;
		
		//보조업무
		sw.stop();
		log.info("[타이머 종료]");
		log.info("[Time log Method : Add]");
		log.info("[Time log MEthod : " + sw.getTotalTimeMillis() + "]");
		
		return result;
	}
	
	public int Mul(int x, int y) {
		
		//보조업무
		Log log = LogFactory.getLog(this.getClass()); //현재동작하는 객체의 정보
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");		
		
		//주업무
		int result = x*y;
		
		//보조업무
		sw.stop();
		log.info("[타이머 종료]");
		log.info("[Time log Method : Add]");
		log.info("[Time log MEthod : " + sw.getTotalTimeMillis() + "]");
				
		return result;
	}
}
