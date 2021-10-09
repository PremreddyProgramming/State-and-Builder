
public class CounterBuilder {
	
	private String material;
	private String price;

	
	
	public CounterBuilder setMaterial(String material) {
		this.material = material;
		return this;
	}
	public CounterBuilder setPrice(String price) {
		this.price = price;
		return this;
	}
	
	
	public Counter getCounter() {
		return new Counter(material, price);
	}

}
