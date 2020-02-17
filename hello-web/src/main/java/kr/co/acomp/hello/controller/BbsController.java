package kr.co.acomp.hello.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.acomp.hello.service.BbsService;
import kr.co.acomp.hello.vo.Article;

@Controller
@RequestMapping("/bbs")
public class BbsController {
	
	private BbsService bbsService;
	@Autowired
	private BbsService service;
	//parameter ����
	
	@RequestMapping("/list")
	public String list() {
		return "bbs/list";
	}
	
	//@RequestMapping(value="write")
	@GetMapping
	public String write(@RequestParam("author") String author) {
		bbsService.registArticle(new Article());
		return "bbs/write_ok";
	}
	
	//@RequestMapping(value="write", method=RequestMethod.POST)
	@PostMapping
	public ModelAndView dowrite(Article article) { //command  ��ü
		bbsService.registArticle(article);
		System.out.println("post requset");
		return new ModelAndView("write_ok").addObject("article",article);
		//return "bbs/write_ok";
	}
	
	@RequestBody
	@RequestMapping("/{articleId}")
	public Article viewDetail(@PathVariable String articleId) {
		Article article = this.bbsService.viewArticleDetail(articleId);
		return article;
		//return new ModelAndView("/bbs/view_detail").addObject("article",article);
	}
}
