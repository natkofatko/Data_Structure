import java.util.Arrays;

public class LinearSearch {
	

	public static void main(String[] args) {
		int []num = {1,2,34,35,65,4};
		Arrays.sort(num);
		System.out.println(binarySearch(num, 0, num.length, 65));
		
		System.out.println(search(num, 34));
		String name; 
		name = "hello"; 
		System.out.println(name.hashCode()); 
		System.out.println(name.hashCode());
		System.out.println(name.hashCode()); 
	}
	
	
//time complexity of this algorithm O(n) 
	public static int search(int[] numbers, int num)
	{
		for(int i=0; i<numbers.length;i++)
		{
			if(numbers[i]==num) {
			System.out.println("index is" +i);
				return numbers[i];
			}			
		}
			return -1; 
			

		
	}
	//this method will return index of number we are looking for
	public static int searchForNumber(int[]numbers, int firstIndex, int lastIndex, int value)
	{
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]==value)
				return i; 
		}
		return -1; 
	}
	
	//time complexity of binary search is O(log n)
	public static int binarySearch(int[]array, int firstIndex, int lastIndex, int value) {
		if(lastIndex>=firstIndex)
		{
			int mid = (firstIndex+(lastIndex-1))/2; 
			if(array[mid]==value)
				return mid;
			else if(array[mid]>value)
				return binarySearch(array, firstIndex, mid-1, value);
			else if (array[mid]<value)
				return binarySearch(array, mid+1, lastIndex, value);
			
		}
		return -1;
	}
	
	
	
}
	
	
