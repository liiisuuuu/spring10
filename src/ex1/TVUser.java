package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// Spring container에 등록된 bean을 getBean()해서 의존성 주입 구현
		
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/tv.xml");
//		안에 있는 bean을 싱글톤으로 관리해줌 - 다 힙에 올라감 static으로 불러서 씀
//		스프링으로 가면 캡슐화해서 알아서 관리해줌
		
		TV tv = ctx.getBean("Ltv", TV.class); // ltv의 원형을 넣어주면 됨
//		 제네릭 : 클래스에 전용 객체 담기 위한 -> 메모리 참조 많이해야돼서 메모리 효율 나빠짐
		tv.powerOn();
		tv.powerOff();
		tv.volumnUp();
		tv.volumnDown();
		
		TV stv = ctx.getBean("Stv", TV.class);
		
		stv.powerOn();
		stv.powerOff();
		stv.volumnUp();
		stv.volumnDown();
	}
}