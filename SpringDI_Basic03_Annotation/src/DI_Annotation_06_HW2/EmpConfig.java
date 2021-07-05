package DI_Annotation_06_HW2;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //xml파일처럼 사용
@EnableAspectJAutoProxy //<aop:aspectj-autoproxy /> 역할
@ComponentScan(basePackages= {"DI_Annotation_06_HW2"}) //@Component 어노테이션이 부여된 클래스들을 자동으로 Scan하여 bean으로 등록해주는 역할
public class EmpConfig {
	/*
	@Bean
	public EmpManagerImpl empManagerImpl() {
		return new EmpManagerImpl();
	}
	
	@Bean
	public EmpLoggingAspect empLoggingAspect() {
		return new EmpLoggingAspect();
	}
	*/
}

// @Bean 객체를 하나씩 만들어 주지 않으려면 
// 클래스들에 @Component, @Service @Named 등의 어노테이션을 붙이고
// @ComponentScan(basePackages= {"패키지명"}) 사용한다!