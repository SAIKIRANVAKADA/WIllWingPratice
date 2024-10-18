
public class PositiveOrNegativeString {

	static boolean checkPositive(String inputString) {
		boolean checker=false;
		inputString.toLowerCase();
		for(int i = 0 ; i<inputString.length()-1;i++) {
			if(inputString.charAt(i)<inputString.charAt(i+1))
			{checker = true;
			}
			
			else 
			{ 
				checker= false;
				break;
			}
			
		}
		return checker;
		
	}
	
	public static void main(String[] args) {
	
		System.out.println(checkPositive("abad"));
	}

}
