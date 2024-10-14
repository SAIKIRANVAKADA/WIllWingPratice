
public class Poweroftwo {
	static boolean checkNumber(int n) {
		
		while(n>2 && n%2==0) {
			n=n/2;
		}
		if (n == 2) {
			return true;
		}
		else {
			return false;
		} 
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkNumber(6));

	}

}
