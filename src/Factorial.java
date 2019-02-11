
public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(fact(3));
	}
	public static  int fact(int num)
	
	{ int result=0;
		if(num==0)
			return 1; 
		else {
		result = num*fact(num-1); 
		
		}
		return result; 
	}

}
