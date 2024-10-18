import java.util.ArrayList;
import java.util.HashMap;

public class ValuesOfMapInSortedOrder {

	static ArrayList<Integer> getValues(HashMap<Integer,Integer> inputHashMAp) {
		ArrayList<Integer> myArray = new ArrayList<>();
		
		for(int i :inputHashMAp.keySet()) {
			
			myArray.add(inputHashMAp.get(i));
		}
		myArray.sort(null);
		return myArray ;
	}
	
	
	public static void main(String[] args) {
	
		HashMap<Integer,Integer>  inputmap= new HashMap<Integer,Integer>();
		inputmap.put(1,3);
		inputmap.put(2, 5);
		inputmap.put(3, 4);
		inputmap.put(4, 2);
		inputmap.put(5, 1);
		
		
		
		System.out.println(getValues(inputmap));
	}

}
