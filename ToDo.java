
import java.util.*;
/**
 * the to do list 
 * @author Charlie Middleton
 *
 */
public class ToDo {
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies = new ArrayList<String>();
	/**
	 * parameter constructor holds what is in a list 
	 * @param title what to do	
	 * @param description description of what to do
	 * @param price price of what to do
	 * @param contact who to contact
	 * @param supplies what is needed 
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String>supplies)
	{
		super();
		this.title = title;
		this.description=description;
		this.price=price;
		this.contact= contact;
		this.supplies=supplies;
		
	}
	/**
	 * getter for price 
	 * @return price
	 */
	public double getPrice() {
		return price;
		
	}
	/**
	 * prints out the list 
	 */
	public String toString() {
	String ret = null;
	ret = "*********" + title + "*********"+"\n" +description + "\n" + "Business Contact: "
+ contact + "\nSupply List:\n";
	for(String supplie:supplies)
		ret+="-" + supplie+"\n";
	ret+="Price: $" + price+"\n";
	return ret;
	}

}
