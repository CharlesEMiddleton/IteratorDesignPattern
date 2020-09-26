import java.util.Iterator;
/**
 * ToDo iterator
 * @author Charlie Middleton
 *
 */
public class ToDoIterator implements Iterator <ToDo> {
private ToDo[] todos;
private int position;
/**
 * parameter constructor/ default values
 * @param todos
 */
public ToDoIterator(ToDo[] todos) {
	this.todos=todos;
	this.position = 0;
}
/**
 * checks to see if there is another position next
 */
public boolean hasNext() {
	if(position<todos.length && todos[position]!=null) {
		return true;
		
	}
	return false;
	
	
}
/**
 * changes the position of the array by 1
 */
public ToDo next() {
	if(this.hasNext()) {
		return todos[position++];
	
	}
	return null;
}
}
