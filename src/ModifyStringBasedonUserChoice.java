
import java.util.LinkedHashSet;

public class ModifyStringBasedonUserChoice {




	static String changeString(String inputString,char inputChar) {
		
		String newStr= Character.toString(inputChar).toUpperCase();
		
		StringBuffer mybuffer = new StringBuffer(inputString);
		
		switch(newStr) {
		
		case "A":{
			mybuffer.append(inputString);
			break;
			}
		
		
		
		case "B":
			
			for(int i = 0 ;i<inputString.length();i++) {
				
				if(i%2==0) {
				mybuffer.setCharAt(i, '*');
					
				}
				
			}break;
			
			
		case "C":
		
			LinkedHashSet<Character> myLinkedhashset = new LinkedHashSet<Character>();
			
			
			for(int j= 0;j<mybuffer.length();j++) {
				myLinkedhashset.add(mybuffer.charAt(j));
			}
			mybuffer.delete(0, mybuffer.length());
			for(char c: myLinkedhashset) {
				String s = Character.toString(c);
				
				mybuffer.append(s);
				
			}
			break;

		
			
			
			
		
		case "D":
			
			 for (int p = 0; p < inputString.length(); p++) {
				  inputString=inputString.toLowerCase();
				 if(p%2==0) {
                 mybuffer.setCharAt(p,(char) (inputString.charAt(p) - 32)); // Convert to lowercase
				 }
				 
             }
			break;
			
		default :{
			mybuffer.delete(0, mybuffer.length());
			mybuffer.append("Please enter the String from A to B");
			
			
		}
			
			
			
			
			
		} //switchend
		return mybuffer.toString();
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(changeString("saikiran", 'B'));

	}

}
