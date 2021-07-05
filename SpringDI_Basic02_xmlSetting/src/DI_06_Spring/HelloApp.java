package DI_06_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		// java 코드
		
		/*
		//Oracle을 사용하여 insert 실행하기
		OracleArticleDao articledao = new OracleArticleDao();
		
		//Mysql을 사용하여 insert 실행하기
		MySqlArticleDao  articledao = new MySqlArticleDao();
		
		
		ArticleService articleservice = new ArticleService(articledao);
		
		Article article = new Article();
		articleservice.write(article);
		*/
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_06_Spring/DI_06.xml");
		
		ArticleService articleservice = context.getBean("articleservice",ArticleService.class);
		Article article = context.getBean("article",Article.class);
		
		articleservice.write(article);
	}

}
