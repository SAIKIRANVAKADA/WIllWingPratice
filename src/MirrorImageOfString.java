
public class MirrorImageOfString {
	 static String getImage (String originalString) {
		StringBuffer bd = new StringBuffer(originalString);
		StringBuffer reversedString = bd.reverse();
		return originalString + "|" + reversedString;
		}
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getImage("Hello"));

	}

}
