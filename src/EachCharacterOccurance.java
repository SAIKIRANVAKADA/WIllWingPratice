import java.util.HashMap;

public class EachCharacterOccurance {
	
	static HashMap<Character, Integer> countCharacter(char[] myArray) {
		
		HashMap<Character,Integer> myHashMap= new HashMap<>();
		
		for(char i : myArray) {
			myHashMap.put(i, myHashMap.getOrDefault(i, 0)+1);
		}
		return myHashMap;
	}
	
	  

	public static void main(String[] args) {

			char[] newCharArray = {'c','a','t','t'};
		System.out.println(countCharacter(newCharArray));
		
	}
	

}
