
public class EncryptTheEnteredString {
	

	static void encryptString(String inputString) {
		StringBuffer mybuffer = new StringBuffer();
		for (int i= 0; i<inputString.length();i++) {
			int asciValueofChar= inputString.charAt(i);
			System.out.println(asciValueofChar);
			if(asciValueofChar>=97 && asciValueofChar<=122) {
				
				if(asciValueofChar+9>122) {
						
					
					
					}
			
		
			}
			else if(asciValueofChar>=65 && asciValueofChar<=90){
				
			}
			
		}
	}
	
	
	public static void main(String[] args) {
	
		
		encryptString("abC ");
	}
	

}
