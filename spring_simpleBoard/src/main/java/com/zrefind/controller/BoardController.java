package com.zrefind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zrefind.domain.ArticleVO;
import com.zrefind.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@AllArgsConstructor
@Log4j
public class BoardController {
	
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		log.info("list");
		model.addAttribute("list", service.getList());
	}
	
	@PostMapping("/register")
	public String register(ArticleVO article, RedirectAttributes rttr) {
		log.info("register: " + article);
		
		service.register(article);
		rttr.addFlashAttribute("result", article.getArticleNo());
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/get")
	public void get(@RequestParam("articleNo") Long articleNo, Model model) {
		log.info("get: " + articleNo);
		model.addAttribute("article", service.get(articleNo));
	}
	
	@PostMapping("/modify")
	public String modify(ArticleVO article, RedirectAttributes rttr) {
		log.info("modify: " + article);
		
		if (service.modify(article)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("articleNo") Long articleNo, RedirectAttributes rttr) {
		log.info("remove: " + articleNo);
		
		if (service.remove(articleNo)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}

}
