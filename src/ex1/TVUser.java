package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// Spring container�� ��ϵ� bean�� getBean()�ؼ� ������ ���� ����
		
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/tv.xml");
//		�ȿ� �ִ� bean�� �̱������� �������� - �� ���� �ö� static���� �ҷ��� ��
//		���������� ���� ĸ��ȭ�ؼ� �˾Ƽ� ��������
		
		TV tv = ctx.getBean("Ltv", TV.class); // ltv�� ������ �־��ָ� ��
//		 ���׸� : Ŭ������ ���� ��ü ��� ���� -> �޸� ���� �����ؾߵż� �޸� ȿ�� ������
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