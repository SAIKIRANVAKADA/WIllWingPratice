import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;


public class ListOfVoters {
	
	static ArrayList<Integer> votersList(HashMap<Integer,String> myMap) {
		SimpleDateFormat formatt = new SimpleDateFormat("dd/MM/yyyy");
	ArrayList <Integer> myArray = new ArrayList<Integer>();
		try {
			  Date currentDate = new Date(); 
			  
	            Calendar currentCal = Calendar.getInstance();
	            
	            currentCal.setTime(currentDate);
	            
	            for (Integer i : myMap.keySet()) {

	                Date myDate = formatt.parse(myMap.get(i)); 
	                
	                Calendar myCal = Calendar.getInstance();
	                
	                myCal.setTime(myDate);
	                
	                int differenceInYears = currentCal.get(Calendar.YEAR)-myCal.get(Calendar.YEAR);
	                
	                if(differenceInYears>18) {//yes}

	                	myArray.add(i);
	                	 
	                }
	                else if(differenceInYears==18 && myCal.get(Calendar.MONTH)<currentCal.get(Calendar.MONTH) ) {
	               
	                	myArray.add(i);
	                	
	                }
	                else if(currentCal.get(Calendar.MONTH)==currentCal.get(Calendar.MONTH) && myCal.get(Calendar.DAY_OF_MONTH)<=currentCal.get(Calendar.DAY_OF_MONTH))

	                	myArray.add(i);
	                

	               }}
		catch (ParseException e) {
			
			e.printStackTrace();
			
		}
		
		return myArray;
	
	}
	
	
	public static void main(String[] args) {
		HashMap<Integer,String> inputMap = new HashMap<Integer, String>();
		
		inputMap.put(1, "31/03/2015");
		
		inputMap.put(2, "17/10/2006");
		
		inputMap.put(3, "20/05/2001");
		
		inputMap.put(4, "16/10/2006");
		
		inputMap.put(5, "17/10/2006");

		System.out.println(votersList(inputMap));

	}

}
