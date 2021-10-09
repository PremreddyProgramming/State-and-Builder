
public class CounterTop {
	
	State orderplaced;
	State checkstock;
	State taketop;
	State delivertop;
	State topsold;
	
	State state;
	
	public CounterTop (int numberoftops)
	{
		orderplaced = new OrderPlaced(this);
		checkstock = new CheckStock(this);
		taketop = new TakeTop(this);
		delivertop = new DeliverTop(this);
		topsold = new TopSold(this);
		
		state = orderplaced;
	}
	
	public void orderPlaced()
	{
		state.orderPlaced();
	}
	
	public void checkStock()
	{
		state.checkStock();;
	}
	
	public void takeTop()
	{
		state.takeTop();
	}
	
	public void deliverTop()
	{
		state.deliverTop();
	}
	
	public void topSold()
	{
		state.topSold();
	}

	
	
	public State getState() 
	{
        return state;
    }
	
	void setState(State state) 
	{
		this.state = state;
	}
	
	public State getOrderPlaced() 
    {
        return orderplaced;
    }

    public State getCheckStock() 
    {
        return checkstock;
    }

    public State getTakeTop() 
    {
        return taketop;
    }
    public State getDeliverTop() 
    {
        return delivertop;
    }
    public State getTopSold() 
    {
        return topsold;
    }
    
    public String toString() 
    {
		StringBuffer result = new StringBuffer();
		result.append("\nCounter Top Limited Company.");
		result.append("\nJava-enabled CounterTop since 2021");
		
		result.append("\n");
		result.append("CounterTop is in " + state + "\n");
		return result.toString();
	}
	

}
