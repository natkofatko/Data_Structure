package QueueImplementation;

import java.util.Stack;

public class Queue1 {

	private Stack<Integer> enqueueStack; 
	private Stack <Integer> dequeueStack; 
	
	public Queue1()
	{
		this.enqueueStack= new Stack<>();
		this.dequeueStack= new Stack<>(); 
		
	}
	
	public void enqueue(int item)
	{
		this.enqueueStack.push(item);
	}
	public int dequeue()
	{
		if(enqueueStack.isEmpty() && dequeueStack.isEmpty()) {
			throw new RuntimeException("No items in stocks");
		}
		if (dequeueStack.isEmpty())
		{
			while(!enqueueStack.isEmpty()) {
				dequeueStack.push(enqueueStack.pop());
			}
		}
	return dequeueStack.pop();
	}

	
}
