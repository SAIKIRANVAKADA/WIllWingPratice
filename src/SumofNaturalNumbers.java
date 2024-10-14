
public class SumofNaturalNumbers {
	static int calculateSum(int n) {
		int sum =0 ;
		while(n >0 ){
			if(n%5==0 || n%3 ==0) {
				sum = sum + n;
			}
			n--;
		}
		return sum;
		  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(calculateSum(10))	;
	
	}

}
