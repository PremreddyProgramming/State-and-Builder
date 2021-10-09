
public class TakeTop implements State {
	
	CounterTop ct;
	public TakeTop(CounterTop ct)
	{
		this.ct=ct;
	}
	
	public void orderPlaced()
	{
		System.out.println("Order is placed.... TakeTOP State");
	}
	public void checkStock()
	{
		System.out.println("Check the stock.... TakeTOP State");
	}
	public void takeTop()
	{
		System.out.println("Take the top.... TakeTOP State");
		ct.setState(ct.getDeliverTop());
	}
	
	public void deliverTop()
	{
		System.out.println("Deliver Top.... TakeTOP State");
	}
	
	public void topSold()
	{
		System.out.println("Top Sold.... TakeTOP State");
	}
	public String toString() 
	{
		return "Take Top";
	}
}