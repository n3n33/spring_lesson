package kr.co.acomp.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.co.acomp.hello.dao.HelloDAO;
import kr.co.acomp.hello.service.BbsService;
import kr.co.acomp.hello.service.HelloService;
import kr.co.acomp.hello.vo.Article;


public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("/spring-context.xml");
		//HelloDAO dao = new HelloDAO();
		HelloDAO dao = ctx.getBean("helloDAO",HelloDAO.class);
		
		HelloService service = ctx.getBean("helloService", HelloService.class);
		int result = service.calcTwoNumbers(7, 34);
		System.out.println(result);     
		
		BbsService ser = ctx.getBean("bbsService", BbsService.class);
		ser.registArticle(new Article(result, null, null, null));
		
	}

}
