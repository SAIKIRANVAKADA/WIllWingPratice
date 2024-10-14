import java.util.Arrays;

public class IncreasingNumber {

	static boolean checkNumber(int numbers) {
		boolean bool = false;
		String temp = Integer.toString(numbers);
		int[] arr = new int[temp.length()];
		int[] newarr = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    arr[i] = temp.charAt(i) - '0' ;

		    newarr[i] = temp.charAt(i)-'0';
		}  

		Arrays.sort(newarr);
		bool = Arrays.equals(arr,newarr);
		return bool;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(checkNumber(123445));
	}

}
