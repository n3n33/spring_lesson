package kr.co.acomp.hello.dao;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.acomp.hello.vo.Article;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:/src/main/webapp/WEB-INF/spring/*.xml")
public class ArticleDAOTest {
	
	/*
	 * private ApplicationContext ctx;
	 * 
	 * @Before public void setup(){
	 * 
	 * ctx = new FileSystemXmlApplicationContext(
	 * "file:src/main/webapp/WEB-INF/spring/.xml"); }
	 */
	@Autowired
	public ArticleDAO dao;
	
	
	public void testInsertArticle() {
		dao.insertArticle(null);
	}
	
	@Test
	@Ignore
	public void testSelecttArticleById() {
		
		//ArticleDAO dao = ctx.getBean("articleDAO",ArticleDAO.class);
		
		
		Article article = dao.selectArticleById(null);
		
		Assert.assertTrue(article.getAuthor().equals("lee"));
		
	}
}
