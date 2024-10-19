import java.util.ArrayList;
import java.util.regex.Pattern;
import java.io.*; 
import java.util.*; 

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
		String newstring2= string2.toLowerCase();
		String newstring1 = string1.toLowerCase();
		String[] splitArray = newstring1.split(Pattern.quote(newstring2 ),-1 ); //BAJBAJ ba   {"j" "j"}

		StringBuffer mybuffer = new StringBuffer(string2);
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
		String newStr2= myStr2.toLowerCase();
		String newStr1 = myStr1.toLowerCase();
		String[] splitArray = newStr1.split(Pattern.quote(newStr2 ),-1);
		
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


