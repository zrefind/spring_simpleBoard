package com.zrefind.service;

import java.util.List;

import com.zrefind.domain.ArticleVO;

public interface BoardService {
	
	public void register(ArticleVO article);
	
	public ArticleVO get(Long articleNo);
	
	public boolean modify(ArticleVO article);
	
	public boolean remove(Long articleNo);
	
	public List<ArticleVO> getList();

}
