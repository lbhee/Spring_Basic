package DI_Annotation_04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 	ConfigContext파일은 DI_Config.xml과 동일한 효과를 가진다! (xml파일 사용x)
*/
@Configuration
public class ConfigContext { //객체를 생성하고 주입
	//xml -> <bean id="user" class="DI_Annotation_04.User">
	//함수를 통해서 객체를 리턴
	@Bean
	public User user() {
		return new User();
	}
	
	//xml -> <bean id="user2" class="DI_Annotation_04.User2">
	@Bean
	public User2 user2() {
		return new User2();
	}
}
