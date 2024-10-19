import java.util.ArrayList;
import java.util.HashMap;

public class SetOfPerfectCouples {

	static ArrayList<Integer> checkPerfectCouple(HashMap<Integer,String> inputMap) {
		
		ArrayList<Integer> PerfectCouple = new ArrayList<Integer>();
		
		for(int i : inputMap.keySet()) {
			ArrayList<String> HusbandChar= new ArrayList<String>();
			ArrayList<String> WifeChar= new ArrayList<String>();
			
			String[] Splitted = inputMap.get(i).split("-");
		
			for(int p = 0; p<Splitted[0].length();p++) {
				Character x= Splitted[0].charAt(p);
				HusbandChar.add(Character.toString(x));
			}
			HusbandChar.sort(null);

			for(int w = 0; w<Splitted[1].length();w++) {
				Character y= Splitted[1].charAt(w);
				WifeChar.add(Character.toString(y));
			}
			WifeChar.sort(null);
			
			if(HusbandChar.equals(WifeChar)) {
				PerfectCouple.add(i);
			}
			
		}
		
		return PerfectCouple;
	}
	
	
	
	public static void main(String[] args) {
		HashMap<Integer,String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "VIMAL-MALIV");
		myMap.put(2, "KAMAL-LKAMA");
		myMap.put(3, "PAVAN-PAVANI");
		myMap.put(4, "MOHAN-SPANDANA");
		
	System.out.println(checkPerfectCouple(myMap));
		

	}

}
