import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicatesInArray {

	
	static int[] modifyArray(int[] inputArray) {
		TreeSet<Integer> myTreeset = new TreeSet<>();
		
		for(int i: inputArray) {
			myTreeset.add(i);
		}
		
		int[] resultArray= new int[myTreeset.size()];
		
		Iterator<Integer> iter = myTreeset.descendingIterator();
		int count = 0;
		while(iter.hasNext()) {
			resultArray[count]=iter.next();
			count=count+1;
		}
	return resultArray;
	}

	public static void main(String[] args) {
		int[] numbers = {1,2,2,3,4,5,5,6};
		int[] completedArray = modifyArray(numbers);
//		System.out.println(modifyArray(numbers));
		for(int z: completedArray) {
			System.out.println(z);
		}
		
	}

}
