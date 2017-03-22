package application;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;


public class Quote {
	private ArrayList<Accessories> AList = new ArrayList<Accessories>();
	
	/**
	 * Adds a new hardware accessory object to ArrayList
	 * 
	 * @param quantity The quantity of hardware items
	 * @param price    The price of each hardware items
	 * @param describe The description of hardware items
	 */
	public void add(int quantity, double price, String describe){
		AList.add(new Accessories(quantity, price, describe));
	}
}
