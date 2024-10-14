
public class DifferenceCalculator {
	static int calculateSum(int n) {
		int sumofSquares =0 ;
		int squaresoftheSum = (n * (n+1)/2)*(n * (n+1)/2);
		while(n >0 ){
			sumofSquares = sumofSquares + n*n;
			n--;  
		}
		return sumofSquares- squaresoftheSum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateSum(10));

	}

}
