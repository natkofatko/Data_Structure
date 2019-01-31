package StackLinkedList;

public class factorial {
public static void main(String[] args) {
	factorial ff= new factorial();
	int n = ff.Factorial(3); 
	System.out.println(n);
}	
	public int Factorial(int number)
	{
		if(number ==0)
			return 1;
		else {
			return (number)*Factorial(number-1); 
		}

	}

}
