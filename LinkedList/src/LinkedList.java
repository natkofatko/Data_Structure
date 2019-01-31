
public class LinkedList <T extends Comparable<T>> implements List <T>
{
	private int sizeOfList;
	private Node<T> root;
	@Override
	public void remove(T data) {
		
		
	}
	@Override
	public void insert(T data) {
		++ sizeOfList; 
		if(root==null)
		{
			this.root=new Node<>(data);}
			else {
				insertDataAtTheBeginning(data);
			}
		}
	
	private void insertDataAtTheBeginning(T data)
	{
		Node <T> newNode = new Node<>(data); 
		newNode.setNextNode(root);
		this.root=newNode;
	}
	
	private void insertAtTheEnd(T data, Node<T> node)
	{
		if(node.getNextNode()!=null)
		{insertAtTheEnd(data, node.getNextNode());}
		else {
			Node<T> newNode = new Node<>(data); 
			node.setNextNode(newNode);
		}
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.sizeOfList; 
	}
	@Override
	public void traverse() {
		if(this.root==null)
			return; 
		Node<T> actualNode = this.root;
		while(actualNode!=null)
		{
			System.out.println(actualNode + "this is actual node");
			actualNode= actualNode.getNextNode(); 
		}
		
	} 

}