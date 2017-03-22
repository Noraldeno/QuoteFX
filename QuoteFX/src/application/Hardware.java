package application;

public interface Hardware {
	/**
	 * Cost of each item
	 * 
	 * @return The price of each item
	 */
	public double price();
	
	/**
	 * Description of the item
	 * 
	 * @return Description
	 */
	public String description();
	
	/**
	 * Returns quantity of each item
	 * 
	 * @return quantity
	 */
	public int quantity();
	
	/**
	 * Total price of each item
	 * 
	 * @return Total Price
	 */
	public double totPrice();
	
	/**
	 * Print of each item
	 * 
	 * @return String of quantity, price, total price
	 */
	public String toString();
}
