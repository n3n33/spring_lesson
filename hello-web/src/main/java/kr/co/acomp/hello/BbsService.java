package kr.co.acomp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {
	@Autowired
	private ArticleDAO articleDAO; // articleDAO√ ±‚»≠
	
	/*
	 * public void setArticleDAO(ArticleDAO dao) { this.articleDAO = dao; }
	 */
	
	
	public void regisetArticle(Article article) {
		articleDAO.insertArticle(article);
	}
	

}
