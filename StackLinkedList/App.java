/**
 * 
 */
package StackLinkedList;

/**
 * @author joemo
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		myStack.push("Joe");
		myStack.push("Natalia");
		myStack.push("Zoe");

		System.out.println(myStack.size());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.print(myStack.size());

	}

}
