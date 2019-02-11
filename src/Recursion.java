import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Recursion extends JApplet{

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7,8,9}; 
		int sum1; 
		System.out.println(sum1=sumOfNumbers(array, 3, 7));
		System.out.println(fibb(7));
		System.out.println(factorial(4));
		System.out.println(GCD(63, 27));
		
		
		
	}

	
	public static int sumOfNumbers(int [] arr, int startPoint, int endPoint)
	{
		if(startPoint > endPoint)
			return 0; 
		else 
			return arr[startPoint] + sumOfNumbers(arr, startPoint+1 ,endPoint);
	}
	
	public static int fibb(int n) {
		if (n==0)
		return 0; 
		else if (n==1)
		return 1;
		else 
			return fibb(n-1)+ fibb(n-2); 
		}
	
	public static int factorial(int n)
	{
		if(n==0)
			return 1; 
		else 
			return n*factorial(n-1); 
	}
	public static int GCD(int x, int y)
	{
		if(x%y==0)
		return y;
		else return GCD(y,x%y); 
	}
	public static int binarySearch(int[]arr, int first,int last, int value)
	{
		//declarea middle point
		int middle; 
		//middle = (arr.length-1)/2; 
	//test for the base case where the value is not found
		if(first>last)
			return -1;
		//calculate the middle position
		middle= (first+last)/2;
		if(arr[middle]==value)
		return arr[middle]; 
		else if(arr[middle]<value)
			return binarySearch(arr, middle+1, last, value); 
		else 
			return binarySearch(arr, middle- 1, last, value); 
	}
	
}
