package factorial;

public class Factorial {

	public static int factorial(int n) {
		
		if(n<=1) {
			return n;
		}
		else {
			return factorial(n-1)*n;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fact = new Factorial();
		
		int result = fact.factorial(5);
		System.out.println(result);
	}

}
