package com.zrefind.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zrefind.domain.ArticleVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTest {
	
	@Setter(onMethod_ = @Autowired)
	private BoardService service;
	
//	@Test
//	public void test_exist() {
//		log.info(service);
//		assertNotNull(service);
//	}
	
//	@Test
//	public void test_register() {
//		ArticleVO article = new ArticleVO();
//		article.setTitle("Smooth Criminal");
//		article.setContent("Annie, are you OK?");
//		article.setWriter("Michael Jackson");
//		
//		service.register(article);
//		log.info("Created ArticleNo.: " + article.getArticleNo());
//	}
	
//	@Test
//	public void test_getList() {
//		service.getList().forEach(article -> log.info(article));
//	}
	
//	@Test
//	public void test_get() {
//		log.info(service.get(1L));
//	}
	
//	@Test
//	public void test_modify() {
//		ArticleVO article = service.get(8L);
//		
//		if (article == null) {
//			return;
//		}
//		
//		article.setTitle("Change Title");
//		log.info("MODIFY RESULT: " + service.modify(article));
//	}
	
	@Test
	public void test_remove() {
		ArticleVO article = service.get(5L);
		
		if (article == null) {
			return;
		}
		
		log.info("REMOVE RESULT: " + service.remove(article.getArticleNo()));
	}

}
