package useInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext contx=new ClassPathXmlApplicationContext("useInterface/pepsi.xml");
	    Pepsi p=(Pepsi)contx.getBean("p1");
	
	    System.out.println(p);
	    contx.registerShutdownHook();
	}
}
