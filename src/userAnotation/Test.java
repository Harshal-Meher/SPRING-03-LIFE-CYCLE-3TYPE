package userAnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) 
{

	AbstractApplicationContext con=new ClassPathXmlApplicationContext("userAnotation/example.xml");
	Example e=(Example)con.getBean("a1");
	System.out.println(e);
	con.registerShutdownHook();
	
}
}