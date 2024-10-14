


public class ModifiedNumbersClass {
	static int modifyNumber(int originalNumber) {
		String myStr = Integer.toString(originalNumber);
		StringBuffer mybuffer = new StringBuffer();
		for (int i=0; i<myStr.length()-1;i++) {
		int	firstNumber = myStr.charAt(i)-'0';
		int secondNumber = myStr.charAt(i+1)-'0';
			mybuffer.append(Math.abs(firstNumber - secondNumber));
		}
		mybuffer.append(myStr.charAt(myStr.length()-1));
		String newString = mybuffer.toString();
		int finalNumber = Integer.parseInt(newString);
		return finalNumber;
		
	}  
	
	
	public static void main(String[] args) {
		
		System.out.println(modifyNumber(1831));


	}

}
