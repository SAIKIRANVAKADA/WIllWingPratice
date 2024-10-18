public class SumofFirstNfibonacciNumbers {
	
	static int factof(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factof(n - 1);
	}
	
	static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		else {
			  return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	static int sumOfFactorial(int num) {
		int sum = 0;
		for(int i = 0;i<=num-1;i++) {
			
			int fib = fibonacci(i);  
            sum += factof(fib); 
			
		}
	return sum-1;
		}
		
		
		

	public static void main(String[] args) {
		int n=5;
	System.out.println(sumOfFactorial(n));
	}
}
