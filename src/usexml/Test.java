package usexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		

	AbstractApplicationContext c=new ClassPathXmlApplicationContext("eats/samosa.xml");
	Samosa s=(Samosa)c.getBean("s1");
	System.out.println(s);
    c.registerShutdownHook();
	
}
}