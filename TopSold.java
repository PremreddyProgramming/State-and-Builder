
public class TopSold implements State {
	
	CounterTop ct;
	public TopSold(CounterTop ct)
	{
		this.ct=ct;
	}
	
	public void orderPlaced()
	{
		System.out.println("Order is placed.... TOPSOLD State");
	}
	public void checkStock()
	{
		System.out.println("Check the stock.... TOPSOLD State");
	}
	public void takeTop()
	{
		System.out.println("Take the top.... TOPSOLD State");
	}
	
	public void deliverTop()
	{
		System.out.println("Deliver Top.... TOPSOLD State");
	}
	
	public void topSold()
	{
		System.out.println("Top Sold.... TOPSOLD State");
	}
	
	public String toString() 
	{
		return "Top Sold";
	}

}