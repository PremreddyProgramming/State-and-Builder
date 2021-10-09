
public class DeliverTop implements State {
	
	CounterTop ct;
	public DeliverTop(CounterTop ct)
	{
		this.ct=ct;
	}
	
	public void orderPlaced()
	{
		System.out.println("Order is placed.... DeliverTOP State");
	}
	public void checkStock()
	{
		System.out.println("Check the stock.... DeliverTOP State");
	}
	public void takeTop()
	{
		System.out.println("Take the top.... DeliverTOP State");
	}
	
	public void deliverTop()
	{
		System.out.println("Deliver Top.... DeliverTOP State");
		ct.setState(ct.getTopSold());
	}
	
	public void topSold()
	{
		System.out.println("Top Sold.... DeliverTOP State");
	}
	public String toString() 
	{
		return "Deliver Top";
	}
}