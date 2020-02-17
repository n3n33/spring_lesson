package kr.co.acomp.hello.service;

import kr.co.acomp.hello.dao.AnotherDAO;
import kr.co.acomp.hello.dao.HelloDAO;

public class HelloService {

	private HelloDAO helloDAO;
	private AnotherDAO anotherDAO;
	
	public void setHelloDAO(HelloDAO dao) { //constructor경우 void아닌 HellloService
		this.helloDAO = dao; 
	}
	
	public void setAnotherDAO(AnotherDAO dao) { //constructor경우 void아닌 HellloService
		this.anotherDAO = dao; 
	}
	public  int calcTwoNumbers(int a, int b) {
	return helloDAO.addTwoNumber(a, b); // 호출 후 메모리에서 dao삭제됨
	}
	
	public int calcTwoNumbersAndAquare(int a, int b) {
		int result = helloDAO.addTwoNumber(a, b);
		return anotherDAO.square(result);
	}
}
