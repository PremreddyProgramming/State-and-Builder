
public class OrderPlaced implements State {
	
	CounterTop ct;
	public OrderPlaced(CounterTop ct)
	{
		this.ct=ct;
	}
	
	public void orderPlaced()
	{
		System.out.println("Order is placed.... OrerPlaced State");
		ct.setState(ct.getCheckStock());
	}
	public void checkStock()
	{
		System.out.println("Check the stock.... OrerPlaced State");
	}
	public void takeTop()
	{
		System.out.println("Take the top.... OrerPlaced State");
	}
	
	public void deliverTop()
	{
		System.out.println("Deliver Top .... OrerPlaced State");
	}
	
	public void topSold()
	{
		System.out.println("Top Sold .... OrerPlaced State");
	}
	public String toString() 
	{
		return "Order Placed";
	}
	
}