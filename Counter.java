
public class Counter {
	
	private String material;
	private String price;
	
	public Counter(String material, String price) {
		super();
		this.material = material;
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return " \n Material : " + material + " \n Price :: " + price + " \n";
	}

}
