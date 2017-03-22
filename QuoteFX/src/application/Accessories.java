package application;

public class Accessories implements Hardware {
	private int quantity;
	private String describe;
	private double price;
	
	public Accessories(int quantity, double price, String info){
		this.quantity = quantity;
		this.price = price;
		describe = info;
	}
	
	@Override
	public double price() {
		// TODO Auto-generated method stub
		return price;
	}
	
	@Override
	public int quantity(){
		return quantity;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return describe;
	}

	@Override
	public double totPrice() {
		// TODO Auto-generated method stub
		return (price * quantity);
	}
	
	@Override
	public String toString(){
		return String.format("%30d | $%29.2f | %30s | $%29.2f |\n", 
				quantity, price, describe, totPrice());
	}

}
