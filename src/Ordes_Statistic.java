import java.lang.reflect.Array;
import java.util.Arrays;

public class Ordes_Statistic {
	
	public static void main(String[] args) {
		
		int[] input = {3,0,4,2,8,1}; 
		//System.out.println(min(input)); 

		//System.out.println(min2(input)); 
		System.out.println(secondSmalest(input)); 
	}
	//Get the smallest number from unsorted array
	public static int min(int[] arr)
	{
		//int minNum = arr[1];
		Arrays.sort(arr);
		return arr[0]; 
		
	}
	public static int min2(int[]arr)
	{
		int num= arr[0];
		for(int i=0;i<arr.length; i++){
		{if(num>arr[i])
			num=arr[i];
		
	}}
		return num; 
}
	public static int secondSmalest(int[]arr)
	{
		int[] input = {3,0,4,2,8}; 
		int min=arr[0];
		int min2=arr[1]; 
		for(int i=0; i<arr.length; i++) {
				if(arr[i]<min) {
					
					min2=min; 
					min=arr[i]; 
					}
				
				else if(arr[i]<min2)
					{min2=arr[i];}
			
		}
		return min2; 
	}
	
}

