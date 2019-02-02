package QueueImplementation;

import java.util.Stack;

public class Queue_one_Stack {

	private Stack <Integer> stack1;  
	
	public Queue_one_Stack()
	{
		this.stack1= new Stack<>(); 
		
	}
	
	//O(1) time complexity
	public void enqueue(int item)
	{
		this.stack1.push(item);
	}
	
	public int dequeue()
	{
		if(stack1.size()==1)
		{
			return stack1.pop();
		}
		int item = stack1.pop(); 
		//recursive call
		int lastDequeueItem = dequeue();
		enqueue(item);
		
		return lastDequeueItem;
	}
	

}
