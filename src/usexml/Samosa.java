package usexml;

public class Samosa
{
	private double price;
	
	public void setPrice(double price) 
	{
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa()
	{
		
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void init()
	{
		System.out.println("Hey Init");
	}
	public void destroy()
	{
		System.out.println("Hey destroy");
	}

}
