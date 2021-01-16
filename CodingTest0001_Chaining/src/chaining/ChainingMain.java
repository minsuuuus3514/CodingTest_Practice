package chaining;

public class ChainingMain {

	public void chain() {
		Calculator calculator = new Calculator();
		int result = calculator.add(4).add(5).substract(3).out();
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainingMain cm = new ChainingMain();
		cm.chain();

	}

}
