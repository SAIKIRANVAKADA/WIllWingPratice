import java.util.ArrayList;

public class SearchForElementsInArray {
	
	static ArrayList<String> modifyElement(ArrayList<String> inputArray, String inputString) {
		
		ArrayList<String> checkArrayForAnyCase = new ArrayList<String>();
		
		for(int i= 0;i<inputArray.size();i++) {
			checkArrayForAnyCase.add(inputArray.get(i).toLowerCase());
		}
		boolean contains = checkArrayForAnyCase.contains(inputString.toLowerCase());
		
		if(contains) {
			int indexOfContains = checkArrayForAnyCase.indexOf(inputString.toLowerCase());
			if(inputString.length()%2==0) {
				inputArray.remove(inputArray.get(indexOfContains));
				inputArray.add(indexOfContains,inputString.substring(0, inputString.length()/2));
			}
			else {
				inputArray.remove(inputArray.get(indexOfContains));
				inputArray.add(indexOfContains,inputString.substring(0, (inputString.length()/2 )+1));
			}
			
		}
		
	return inputArray;
	}
	
	

	public static void main(String[] args) {
	
		ArrayList<String> newString = new ArrayList<String>();
		newString.add("Ball");
		newString.add("Cat");
		newString.add("Dog");
		newString.add("Apple");
		newString.add("Car");
		
		
		System.out.println(modifyElement(newString, "Apples"));
	}

}
