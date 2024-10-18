
public class SumOfNaturalNumbersDivisibleBy3And8 {
	static int calculateSum(int n) {
		int sum =0 ;
		while(n >0 ){
			if(n%2==0 &&(n%3==0 || n%8==0)) {
				sum = sum + n;
			}
			n--;
		}
		return sum;
		  
	}

	public static void main(String[] args) {

	System.out.println(calculateSum(10))	;
	
	}

}
