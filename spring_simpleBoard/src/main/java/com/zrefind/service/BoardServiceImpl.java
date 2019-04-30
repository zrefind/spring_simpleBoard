package com.zrefind.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zrefind.domain.ArticleVO;
import com.zrefind.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@AllArgsConstructor
@Log4j
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;
	
	@Override
	public void register(ArticleVO article) {
		log.info("register......" + article);
		mapper.insertSelectKey(article);
	}

	@Override
	public ArticleVO get(Long articleNo) {
		log.info("get......" + articleNo);
		return mapper.read(articleNo);
	}

	@Override
	public boolean modify(ArticleVO article) {
		log.info("modify......" + article);
		return mapper.update(article) == 1;
	}

	@Override
	public boolean remove(Long articleNo) {
		log.info("remove......" + articleNo);
		return mapper.delete(articleNo) == 1;
	}

	@Override
	public List<ArticleVO> getList() {
		log.info("getList......");
		return mapper.getList();
	}

}
