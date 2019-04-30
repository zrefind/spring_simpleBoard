package com.zrefind.mapper;

import java.util.List;

import com.zrefind.domain.ArticleVO;

public interface BoardMapper {
	
	public List<ArticleVO> getList();
	
	public void insert(ArticleVO article);
	
	public void insertSelectKey(ArticleVO article);
	
	public ArticleVO read(Long articleNo);

}
