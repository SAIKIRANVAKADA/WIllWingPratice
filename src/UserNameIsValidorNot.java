
public class UserNameIsValidorNot {
	
		static Boolean validateUserName(String inputString) {
			String[] c = inputString.split("_");
			if(c[0].length()>=8) {
				if(inputString.endsWith("_job")) {
					return true;
				}
				else {return false;}
			}
			else {
				return false;
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validateUserName("saikiraan_job"));
	}

}
