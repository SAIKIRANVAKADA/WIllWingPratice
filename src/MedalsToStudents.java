import java.util.HashMap;


public class MedalsToStudents{
	static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> myArray){
		HashMap<Integer,String> returnMap = new HashMap<>();
		for (int i : myArray.keySet()) {
			if(myArray.get(i)>=90) {
				returnMap.put(i,"Gold");
			}
			else if(myArray.get(i)>=80 && myArray.get(i)<90){
				returnMap.put(i, "Silver");
			}
			else if(myArray.get(i)>=70 && myArray.get(i)<80) {
				returnMap.put(i, "Bronze");
				}
		}
		return returnMap;
		
	}
	public static void main(String[] args) {
		HashMap<Integer,Integer> ourHashMap = new HashMap<>();
		ourHashMap.put(1831, 85);
		ourHashMap.put(1832, 90);
		ourHashMap.put(1833, 99);
		ourHashMap.put(1834, 50);
		ourHashMap.put(1835, 70);
		ourHashMap.put(1836, 80);
		System.out.println(getStudents(ourHashMap));
	}
	
}
