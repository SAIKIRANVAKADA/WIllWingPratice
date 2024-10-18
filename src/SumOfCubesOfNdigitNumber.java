
public class SumOfCubesOfNdigitNumber {

	static void findSum(int inputNum) {
		int Sum = 0;
		while(inputNum>0) {
			int singleNum = inputNum%10;
			inputNum=inputNum/10;
			Sum =  Sum + singleNum*singleNum*singleNum ;
			
			
		}
		System.out.println(Sum);
	}
	
	
	public static void main(String[] args) {
		
		
		findSum(123);

	}

}
