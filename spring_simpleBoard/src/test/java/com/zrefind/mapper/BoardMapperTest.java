package com.zrefind.mapper;

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
public class BoardMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public void test_getList() {
//		mapper.getList().forEach(article -> log.info(article));
//	}
	
//	@Test
//	public void test_insert() {
//		ArticleVO article = new ArticleVO();
//		article.setTitle("Winter is comming");
//		article.setContent("protect us");
//		article.setWriter("House Stark");
//		
//		mapper.insert(article);
//		log.info(article);
//	}
	
	@Test
	public void test_insertSelectKey() {
		ArticleVO article = new ArticleVO();
		article.setTitle("Lannister always pays his debts");
		article.setContent("it is true");
		article.setWriter("House Lannister");
		
		mapper.insertSelectKey(article);
		log.info(article);
	}

}
