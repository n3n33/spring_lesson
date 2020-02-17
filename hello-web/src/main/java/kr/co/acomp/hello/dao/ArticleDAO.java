package kr.co.acomp.hello.dao;

import kr.co.acomp.hello.vo.Article;

public class ArticleDAO {
	public void insertArticle(Article article) {
		System.out.println("inset ok");
	}

	public Article selectArticleById(String articleId) {
		Article article = new Article(10,"lee","test","test");
		return article;
	}
}
