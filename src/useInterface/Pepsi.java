package useInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean ,DisposableBean {
	
	private int price;

	public void setPrice(int price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Take a Pepsi : Init");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Our the Pepsi : Distroy");
	}
	
	

}
