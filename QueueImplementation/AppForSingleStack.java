package QueueImplementation;

public class AppForSingleStack {

	public static void main(String[] args) {
	Queue_one_Stack q2 = new Queue_one_Stack(); 
	q2.enqueue(12);
	q2.enqueue(13);
	q2.enqueue(14);
	q2.enqueue(15);
	
	System.out.println(q2.dequeue());
	
	q2.enqueue(22);
	System.out.println(q2.dequeue());
	System.out.println(q2.dequeue());
	System.out.println(q2.dequeue());
	System.out.println(q2.dequeue());
	}

}
