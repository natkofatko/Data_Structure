package QueueImplementation;

public class App {
public static void main(String[] args) {
	

	Queue1 q = new Queue1(); 
	q.enqueue(22);
q.enqueue(10);
q.enqueue(23);
q.enqueue(123);
q.enqueue(154);
System.out.println(q.dequeue());
q.enqueue(111);
System.out.println(q.dequeue());
System.out.println(q.dequeue());
System.out.println(q.dequeue());
System.out.println(q.dequeue());
}
}
