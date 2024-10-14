import java.util.HashMap;


public class SquaresofThenumbersInTheArray {
	
	static HashMap<Integer,Integer> getSquares(int[] newarr){
		HashMap<Integer,Integer> returnMap = new HashMap<Integer ,Integer>();
		for (int i = 0; i<newarr.length;i++) {
			int num = newarr[i];
			int squareNum = num*num;
			returnMap.put(num,squareNum);
		}
		return returnMap ;
		
	} 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] givenarray= {1,2,3,4,5};
		System.out.println(getSquares(givenarray));
	}

}
