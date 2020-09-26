import java.util.Arrays;

/**
 * contractor to do list 
 * @author Charlie Middleton
 *
 */
import java.util.*;
/**
 * contractor to do list
 * @author Charlie Middleton
 *
 */
public class ContractorToDoList {
private String address;
private ToDo[] todos = new ToDo[2];
private int count;
/**
 * parameter constructor
 * @param address
 */
public ContractorToDoList(String address) {
	super();
	this.address= address;
}

	
/**
 * adds to do in the list
 * @param title name of what to do
 * @param description description of what to do
 * @param price how much 
 * @param contact who to call
 * @param supplies what to bring
 */
public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
boolean added = false;
for(int i = 0; i<todos.length;i++) {
	if(todos[i]==null) {
		todos[i] = new ToDo(title, description, price, contact, supplies);
		added = true;
		break;
	}
}
if (added == false) {
	this.todos = this.growArray(todos);
	this.addToDo(title, description, price, contact, supplies);
}
}
/**
 * creates iterator
 * @return new to do iterator
 */
public ToDoIterator createIterator() {
	return new ToDoIterator(this.todos);
}
/**
 * getter for address
 * @return address
 */
public String getAddress() {
	return address;
	
}
/**
 * gets the total cost 
 * @return total cost
 */
public double getTotalCost() {
	double total= 0.0;
	for(int i=0; i<todos.length; i++) {
		if(todos[i]!=null) {
			total+=todos[i].getPrice();
		}
	}
	return total;
	
}
/**
 * grows the array by 1
 * @param todos to do list
 * @return array extends
 */
private ToDo[] growArray(ToDo[] todos) {
	return Arrays.copyOf(todos,todos.length*2);
	
}
}
