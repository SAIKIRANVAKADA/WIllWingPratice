import java.util.ArrayList;


public class OperationsOnTwoStringObjects {

	static ArrayList<String> myArray= new ArrayList<>();
	
	static ArrayList<String> modifyStrings(String newStr1,String newStr2) {
		replaceS2OccurenceIns1(newStr1,newStr2);
		return myArray;
	}

	static void replaceS2OccurenceIns1(String s1, String s2) {
		
		StringBuffer mybuffer= new StringBuffer();
		int myLength = s1.length();
		for (int i= 0; i<myLength;i++) {
			if(i%2 == 0) {
				mybuffer.append(s2);
			} 
			else {
				mybuffer.append(s1.charAt(i));
			}
			}
		myArray.add(mybuffer.toString());
		
		s2MorethanS1(s1,s2);
	
			
		}
	
	
	
	
	
	static void s2MorethanS1(String string1, String string2){
		
		String[] splitArray = newstring1.split(newstring2,-1 ); 

		StringBuffer mybuffer = new StringBuffer("(?i)"+string2);
		if(splitArray.length>2) {
			String mysubstring = string1.substring(0, string1.length()- string2.length());

			myArray.add(mysubstring+ mybuffer.reverse());
			
		}
		else {

			myArray.add(string1+string2);
			
		}
		replaceFirst(string1,string2);
	}
	
	
	
	
	
	static void replaceFirst(String myStr1, String myStr2) {
		
		String[] splitArray = newStr1.split("(?i)"+newStr2,-1);
		
		if(splitArray.length>2) {
		String replaceString = myStr1.replaceFirst("(?i)"+myStr2, "");

		myArray.add(replaceString);
		}
		else {
			myArray.add(myStr1);
		}
		adding2tostartandend(myStr1,myStr2);
	}
	
	
	
	
	 static void adding2tostartandend(String string1, String string2) {
		if(string2.length()%2==0) {
			String startSubstring = string2.substring(0,string2.length()/2);
			String endSubstring = string2.substring(string2.length()/2,string2.length());
			String newString = startSubstring.concat(string1);

			myArray.add(newString.concat(endSubstring));
		}
		else {
			String startSubstring = string2.substring(0,(string2.length()/2)+1);
			String endSubstring = string2.substring((string2.length()/2) +1  ,string2.length());
			String newString = startSubstring.concat(string1);

			myArray.add(newString.concat(endSubstring));
		}
		modifiedSameChartoStars(string1,string2);
	}
	
	 
	 
	 static void modifiedSameChartoStars(String str1, String str2) {
		 String completedString = str1;
		for (int i = 0;i<str2.length();i++) {
			Character mychar = str2.charAt(i);
			mychar.toString();
			String newStr = "(?i)" + mychar;
			completedString = completedString.replaceAll(newStr, "*");
		}

		myArray.add(completedString);
		
	}





	
	  
	public static void main(String[] args) {
		modifyStrings("BAT", "at");
		for (String s : myArray) {
			System.out.println(s);
		}
	}
}


