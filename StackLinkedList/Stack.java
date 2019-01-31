package StackLinkedList;

public class Stack <T extends Comparable<T>> {

	private int count; 
	private Node<T> root;
	
	public int size()
	{ return this.count;
	}
	
	public T peek()
	{
		return this.root.getData();
	}
	
	public T pop()
	{
		T itemToPop = this.root.getData();
		this.root = this.root.getNextNode();
		this.count--;
		return itemToPop; 
	}
	
	public boolean isEmpty()
	{
		return this.root==null;
	}
	
	public void push (T newData)
	{
		this.count++;
		if(this.root==null) {
			this.root= new Node<>(newData);
		}else {
			Node<T> oldRoot = this.root; 
			this.root= new Node<>(newData);
			this.root.setNextNode(oldRoot);
					
				
					}
		}
		
}

