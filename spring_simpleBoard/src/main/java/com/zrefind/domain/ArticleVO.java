package com.zrefind.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ArticleVO {
	
	private Long articleNo;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updatedate;

}
