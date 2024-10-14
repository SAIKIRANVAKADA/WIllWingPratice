import java.util.ArrayList;
public class ListRemove {
	static ArrayList<Integer> removeElements(ArrayList<Integer> list1,ArrayList<Integer> list2) {
		
		list1.removeAll(list2);
		
		return list1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> arrlist1 = new ArrayList<Integer>(); 

		  	arrlist1.add(1); 
		  	arrlist1.add(2); 
		  	arrlist1.add(3); 
		  	arrlist1.add(4); 
		  	arrlist1.add(5); 
		ArrayList<Integer> arrlist2 = new ArrayList<Integer>(); 
        arrlist2.add(1); 
        arrlist2.add(2); 
        arrlist2.add(3); 
		System.out.println(removeElements(arrlist1, arrlist2));
	}

}
