import java.util.HashMap;

public class StateandCapitalReturnMap {
	
	
	static HashMap<String, String> getStates(String inputString ,String del1, char del2) {
		HashMap<String,String> returnHashMap = new HashMap<String,String>();
		String newdel2 = Character.toString(del2);
		String[] StatesandCapitalscombined = inputString.split(newdel2);
		
		for(String i:StatesandCapitalscombined) {
			String myStr= "||";
			String[] StatesandCapitalsremoved = i.split(del1.contains(myStr)? "\\|\\|": del1);
				
			returnHashMap.put(StatesandCapitalsremoved[0], StatesandCapitalsremoved[1]);
		}
		return returnHashMap;
	}

	public static void main(String[] args) {

		System.out.println(getStates("tamilnadu||chennai-karanataka||bengaluru","||",'-'));

	}

}

