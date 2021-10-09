
public class CheckStock implements State {
	
	CounterTop ct;
	public CheckStock(CounterTop ct)
	{
		this.ct=ct;
	}
	
	public void orderPlaced()
	{
		System.out.println("Counter Tops are Available and In stock");
		
	}
	public void checkStock()
	{
		System.out.println("Counter Tops are not sold yet");
		ct.setState(ct.getTakeTop());
	}
	public void takeTop()
	{
		System.out.println("Counter Tops are In Stock do not need to buy");
	}
	
	public void deliverTop()
	{
		System.out.println("Counter Tops are In Stock do not need to buy");
	}
	
	public void topSold()
	{
		System.out.println("Counter Tops are In Stock do not need to buy");
	}
	
	public String toString() 
	{
		return "Check Stock";
	}
}
