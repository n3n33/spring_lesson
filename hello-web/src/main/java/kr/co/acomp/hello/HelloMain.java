package kr.co.acomp.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		ser.regisetArticle(new Article(result, null, null, null));
		
	}

}
