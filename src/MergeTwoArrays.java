import java.util.ArrayList;

public class MergeTwoArrays {
	
	static char[]  mergeData(ArrayList<Character> arrayList1,ArrayList<Character> arrayList2) {
		char[] outPutArray = new char[arrayList1.size()+ arrayList2.size()];
		arrayList1.addAll(arrayList2);
//		System.out.println(arrayList1);
		arrayList1.sort(null);
		for(char i=0 ; i<arrayList1.size();i++) {
			outPutArray[i]=arrayList1.get(i);
		}
		
		return
				outPutArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList<Character> arr1= new ArrayList<Character>();
			arr1.add('a');
			arr1.add('b');
			arr1.add('c');
			arr1.add('d');
			ArrayList<Character> arr2= new ArrayList<Character>();
			arr2.add('e');
			arr2.add('f');
			arr2.add('g');
			arr2.add('h');
			char[] myArray = mergeData(arr1, arr2);
			for(char c: myArray) {
			System.out.println(c );}
	}

}
