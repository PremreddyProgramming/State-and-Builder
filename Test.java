
public class Test {

	public static void main(String[] args) 
	{
		
		
		Counter wooden = new CounterBuilder().setMaterial("Wooden").setPrice("$226").getCounter();
		Counter marble = new CounterBuilder().setMaterial("Marble").setPrice("$300").getCounter();
		
		
		System.out.println("Wooden Counter Top :: "+  wooden);
		System.out.println("Marble's Counter Top ::  "+  marble);
		
		
		CounterTop ct = new CounterTop(3);
		 System.out.println(ct);
		 
		 ct.orderPlaced();

		 System.out.println(ct);
		 ct.checkStock();
		 
		 System.out.println(ct);
		 
		 ct.takeTop();
		 System.out.println(ct);
		 ct.deliverTop();
		 System.out.println(ct);
		// ct.topSold();
		 
		 
		 System.out.println(ct);
		 
	}

}
