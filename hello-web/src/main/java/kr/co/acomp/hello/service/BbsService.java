package kr.co.acomp.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.acomp.hello.dao.ArticleDAO;
import kr.co.acomp.hello.vo.Article;

@Service
public class BbsService {
	@Autowired
	private ArticleDAO articleDAO; // articleDAO√ ±‚»≠
	
	/*
	 * public void setArticleDAO(ArticleDAO dao) { this.articleDAO = dao; }
	 */
	
	
	public void registArticle(Article article) {
		articleDAO.insertArticle(article);
	}

	public String viewDetail(String articleId) {
		return "write_ok"+ articleId;
	}

	public Article viewArticleDetail(String articleId) {
		
		return this.articleDAO.selectArticleById(articleId);
	}
	

}
